import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();
        
        entrada.close ();

        if (idade < 16)
        {
            System.out.println ("Não eleitor");           
        }
        else if ((idade >= 18) && (idade <= 65))
        {
            System.out.println ("Eleitor Obrigatório"); 
        }
        else if (((idade >= 16) && (idade <= 18)) || (idade > 65))
        {
            System.out.println ("Eleitor Facultativo"); 
        }
        
        

        
    }
    
}
