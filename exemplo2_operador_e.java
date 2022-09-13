import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    String login, senha; 
	    
	    Scanner entrada = new Scanner (System.in);
	    
		System.out.println("Digite seu login: ");
		login = entrada.nextLine();
		System.out.println("Digite sua senha: ");
		senha = entrada.nextLine();
		
		if ((login.equals ("aluno"))&&(senha.equals("123")))
		{
		    System.out.println("Login válido - Acesso Liberado");
		}
		else
		{
		    System.out.println("Dados incorretos");
		}
	}
}
