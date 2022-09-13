import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    Scanner entrada = new Scanner (System.in);
	    
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		
		if ((num>=1)&&(num<=10))
		{
		    System.out.println("Número está no intervalo de 1 a 10");
		}
		else
		{
		    System.out.println("Número inválido");
		}
	}
}
