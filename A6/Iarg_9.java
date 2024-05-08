import java.util.*;
public class Iarg_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int num, temp;
	int vet[] = new int [2];
	System.out.println("Vetores:");
	for(int i=0; i<vet.length;i++) {
	vet[i]=sc.nextInt();
	}
	System.out.println("menu:\n1. ordem direta\n2. ordem inversa\n0. finalizar o programa");
	num = sc.nextInt();
		switch(num) {
		case 1:
			 System.out.println("[] : "
		               + Arrays.toString(vet));
			break;
		case 2:
			for (int i = 0; i < vet.length; i++) {     
	            for (int j = i+1; j < vet.length; j++) {     
	               if(vet[i] < vet[j]) {    
	                   temp = vet[i];    
	                   vet[i] = vet[j];    
	                   vet[j] = temp;    
	               }     
	            }     
	        }    
	            
	        System.out.println();    
	        
	        System.out.println("Elements of array sorted in descending order: ");    
	        for (int i = 0; i < vet.length; i++) {     
	            System.out.print(vet[i] + " ");    
	        }    

			break;
		default:
			System.out.println("Fim");
			break;
		}

	}

}
