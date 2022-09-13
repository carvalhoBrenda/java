
import java.util.Scanner;
/*a primeira linha é a importação da biblioteca do java*/

public class Main
{
	public static void main(String[] args) {
	    int opcao;
	    
	    Scanner entrada = new Scanner (System.in);
	   
	    
		System.out.println("***** Escolha seu curso *****");
		System.out.println("1 - Administração");
		System.out.println("2 - Informática");
		System.out.println("3 - Nutrição");
		System.out.println("4 - Turismo");
		opcao = entrada.nextInt();
		
		entrada.close();
		
		if (opcao ==1)
		{
		    System.out.println ("Você escolheu Administração!");
		}
		else if (opcao ==2)
		{
		    System.out.println ("Você escolheu Informática!");
		}
		else if (opcao ==3)
		{
		    System.out.println ("Você escolheu Nutrição!");
		}
		else if (opcao ==4)
		{
		    System.out.println ("Você escolheu Turismo!");
		}
		else
		{
		    System.out.println ("Opção inválida");
		}
	}
}



