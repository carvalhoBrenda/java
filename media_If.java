
import java.util.Scanner;
/*a primeira linha é a importação da biblioteca do java*/

public class Main
{
	public static void main(String[] args) {
	    double n1, n2, media;
	    
	    Scanner entrada = new Scanner (System.in);
	   
	    
		System.out.println("Digite a primeira nota:");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite segunda nota:");
		n2 = entrada.nextDouble();
		
		entrada.close();
		
		media=(n1 + n2)/2;
		System.out.println ("Média: " + media);
		System.out.println();
		
		if (media >=5)
		{
		    System.out.println ("Aprovado!");
		}
		else
		{
		    System.out.println ("Reprovado!");
		}
		
	}
}



