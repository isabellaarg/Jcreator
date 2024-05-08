import java.util.Scanner;
public class Iarg_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num [] = new int [8];
		int pos [] = new int [8];
		int neg [] = new int [8];
		
		System.out.println("Digite 8 números inteiros: ");
		int ipos=0, ineg=0;
	for(int i=0; i<num.length; i++){
	    num[i] = sc.nextInt();
	    if(num[i]>=0){
	        pos[ipos] = num[i];
	        ipos++;
	    }else{
	        neg[ineg] = num[i];
	        ineg++;
	    }
	}
    System.out.printf("positivos", ipos);
    for (int i=0; i<ipos; i++){
        System.out.println(pos[i]);
    }
    System.out.printf("negativos", ineg);
    for(int i=0; i<ineg; i++){
        System.out.println(neg[i]);
    }
    }
}
