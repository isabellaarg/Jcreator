import java.util.*;
public class Iarg_5 {

	public static void main(String[] args) {
		int [] arr = new int [10];     
        int temp = 0;    
        Scanner sc = new Scanner(System.in);  
        System.out.println("Digite um número:");    
        for (int i = 0; i < arr.length; i++) {     
          arr[i]=sc.nextInt();     
        }    
               
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
        
        System.out.println("Vetor em ordem decrescente: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}  
