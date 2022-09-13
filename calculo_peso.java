
import java.util.Scanner;
/*a primeira linha é a importação da biblioteca do java*/

public class Main
{
	public static void main(String[] args) {
	    double peso, peso_magro, peso_gordo;
	    
	    Scanner entrada = new Scanner (System.in);
	   /*cria um objeto pertencente a aquela classe. Serve para a entrada de dados*/
	    
		System.out.println("Digite seu peso:");
		peso = entrada.nextDouble();
		
		entrada.close();
		/*fecha a entrada de dados pelo console*/
		
		peso_gordo=peso+(peso*15/100);
		peso_magro=peso-(peso*20/100);
		
		System.out.println("Se você engordar 15%, seu novo peso será de " + peso_gordo);
		System.out.println("Se você emagrecer 20%, seu novo peso será de " + peso_magro);
		
	}
}


