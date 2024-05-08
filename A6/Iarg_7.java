import java.util.*;
public class Iarg_7 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [5];
		int []arr2 = new int [5];
		int[] result = new int[arr.length + arr2.length];
		System.out.println("Digite os números do primeiro vetor");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			}
        Arrays.sort(arr);
        
        System.out.println("Digite os números do primeiro vetor");
		for(int i=0; i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
			}
		 System.out.println("Primeiro vetor em ordem crescente: "
	               + Arrays.toString(arr));
        Arrays.sort(arr2);
        System.out.println("Segundo vetor em ordem crescente: "
               + Arrays.toString(arr2));
      
        int index = 0;
        for (int elem : arr) {
            result[index] = elem;
            index++;
        }

        for (int elem : arr2) {
            result[index] = elem;
            index++;
        }
        Arrays.sort(result);
        System.out.println("Junção dos vetores em ordem crescente: "Arrays.toString(result));
    }
}