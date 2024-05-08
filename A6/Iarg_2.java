import java.util.Scanner;
public class Iarg_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x [] = new int [10];
		int y [] = new int [10];
		int z [] = new int [20];
		
		int i, j=0;
		
		for (i=0; i<3; i++)
		{
			System.out.println("Digite os números do primeiro vetor");
			x[i] = sc.nextInt();
		}
		
		for (i=0; i<3; i++)
		{
			System.out.println("Digite os números do segundo vetor");
			y[i] = sc.nextInt();
			
		}
		
	
		for (i=0; i<3; i++)
		{

			z[j] = x[i];
			j++;
			z[j] = y[i];
			j++;
			
		}
		for (j=0; j<6; j++)
		{
		System.out.println(z[j]+"");
		}

}

}
