
import java.util.Scanner;
/*a primeira linha é a importação da biblioteca do java*/

public class Main
{
	public static void main(String[] args) {
	    double salario_inicial, salario_final, conta1, conta2, multa_conta1, multa_conta2;
	    
	    Scanner entrada = new Scanner (System.in);
	   /*cria um objeto pertencente a aquela classe. Serve para a entrada de dados*/
	    
		System.out.println("Digite o valor do seu salário:");
		salario_inicial = entrada.nextDouble();
		System.out.println("Digite o valor da primeira conta:");
		conta1 = entrada.nextDouble();
		System.out.println("Digite o valor da primeira conta:");
		conta2 = entrada.nextDouble();
		
		entrada.close();
		/*fecha a entrada de dados pelo console*/
		
		multa_conta1=conta1+(conta1*2/100);
		multa_conta2=conta2+(conta2*2/100);
		salario_final=salario_inicial-multa_conta1-multa_conta2;
		
		System.out.println("Seu salário final será de " + salario_final);

		
	}
}



