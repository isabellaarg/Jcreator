import java.util.Scanner;

public class Iarg_1 {

	public static void main(String[] args) {
		int n[] = new int[9]; 
		int num =0;
	    String  primo = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 9 números");
        for (int i = 0; i < n.length; i++) {    
        	System.out.println(i+1 + "° número");	
            n[i] = sc.nextInt();   
        }
        for (int i = 0; i <n.length; i++)  
	      {                   
	         int cont=0;           
	         for(num =i; num>=1; num--)
	         {
	        if(i%num==0)
	        {
	        cont++;
	        }
	     }
	     if (cont ==2)
	     {
	        primo = primo + i + " ";
	     }  
	      } 
	      System.out.println("Os numeros primos são:");
	      System.out.println(primo);
	   }
	}