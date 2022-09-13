
import java.util.Scanner;
/*a primeira linha é a importação da biblioteca do java*/

public class Main
{
	public static void main(String[] args) {
	    double salario_liquido, salario, valor_hora, n_aulas, desconto;
	    
	    Scanner entrada = new Scanner (System.in);
	   /*cria um objeto pertencente a aquela classe. Serve para a entrada de dados*/
	    
		System.out.println("Digite o valor da hora aula:");
		valor_hora = entrada.nextDouble();
		
		System.out.println("Digite número de aulas:");
		n_aulas = entrada.nextDouble();
		
		System.out.println("Digite o valor do desconto:");
		desconto = entrada.nextDouble();
		
		entrada.close();
		/*fecha a entrada de dados pelo console*/
		
		salario=valor_hora*n_aulas;
		salario_liquido=salario-(salario*desconto/100);
		
		System.out.println("Seu salário líquido será de " + salario_liquido);

		
	}
}


