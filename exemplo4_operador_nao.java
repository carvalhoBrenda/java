import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	   
	    Scanner entrada = new Scanner (System.in);
	    
		System.out.println("Digite sua senha: ");
		int senha = entrada.nextInt();
		
		if (!(senha == 999))
		{
		    System.out.println("Senha inválida");
		}
		else
		{
		    System.out.println("Senha correta");
		}
	}
}
