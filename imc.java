
import java.util.Scanner;
/*a primeira linha é a importação da biblioteca do java*/

public class Main
{
	public static void main(String[] args) {
	    String nome;
	    int idade;
	    double altura, peso, imc=0;
	    
	    Scanner entrada = new Scanner (System.in);
	   /*cria um objeto pertencente a aquela classe. Serve para a entrada de dados*/
	    
		System.out.println("Digite seu nome:");
		nome = entrada.nextLine();
		
		System.out.println("Digite sua idade:");
		idade = entrada.nextInt();
		
		System.out.println("Digite sua altura:");
		altura = entrada.nextDouble();
		
		System.out.println("Digite sua peso:");
		peso = entrada.nextDouble();
		
		entrada.close();
		/*fecha a entrada de dados pelo console*/
		
		imc=peso/(altura*altura);
		
		System.out.println("Nome: " + nome + " seu IMC é igual a " + imc);
		
	}
}
