import java.util.*;
public class Iarg_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int num[] = new int[8];
	    int i, k, aux;
	    System.out.println("Digite 8 números");
	    for(i=0; i<num.length; i++){
	        num[i] = sc.nextInt();
	    }
	    for(i=0; i<num.length; i++){
	        for(k=0; k<num.length; k++){
	            if(num[i]<num[k]){
	                aux=num[i];
	                num[i]=num[k];
	                num[k]=aux;
	            }
	        }
	    }
	    System.out.println("Vetor em ordem crescente: ");    
	    for(i=0; i<num.length; i++){
	        System.out.print(num[i] + " ");
	    }
	    }
	}
