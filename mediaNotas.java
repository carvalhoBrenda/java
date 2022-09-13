
import java.util.Scanner;
/*a primeira linha é a importação da biblioteca do java*/

public class Main
{
	public static void main(String[] args) {
	    String nome;
	    double nota1, nota2, nota3, nota4, media;
	    
	    Scanner entrada = new Scanner (System.in);
	   /*cria um objeto pertencente a aquela classe. Serve para a entrada de dados*/
	    
		System.out.println("Digite seu nome:");
		nome = entrada.nextLine();
		
		System.out.println("Digite a primeira nota:");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota2 = entrada.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		nota3 = entrada.nextDouble();
		
		System.out.println("Digite a quarta nota:");
		nota4 = entrada.nextDouble();
		
		entrada.close();
		/*fecha a entrada de dados pelo console*/
		
		media=(nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Nome: " + nome + " sua média é " + media);
		
	}
}


