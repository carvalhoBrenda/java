
import java.util.Scanner;
/*a primeira linha é a importação da biblioteca do java*/

public class Main
{
	public static void main(String[] args) {
	    double salario_bruto, salario, salario_desconto;
	    
	    Scanner entrada = new Scanner (System.in);
	   /*cria um objeto pertencente a aquela classe. Serve para a entrada de dados*/
	    
		System.out.println("Digite o valor do seu salário:");
		salario = entrada.nextDouble();
		
		entrada.close();
		/*fecha a entrada de dados pelo console*/
		
		salario_desconto=salario-(salario*10/100);
		salario_bruto=salario_desconto-(salario_desconto*5/100);
		
		System.out.println("Seu salário bruto será de " + salario_bruto);

		
	}
}



