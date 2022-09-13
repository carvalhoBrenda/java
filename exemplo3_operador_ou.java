import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	   
	    Scanner entrada = new Scanner (System.in);
	    
		System.out.println("Digite um número de 1 a 3: ");
		int num = entrada.nextInt();
		
		if ((num ==1 ) || (num == 2) || (num == 3))
		{
		    System.out.println("Número válido");
		}
		else
		{
		    System.out.println("Número inválido");
		}
	}
}
