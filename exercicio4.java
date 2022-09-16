import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        double valor_compra, valor_venda, lucro;
        int quant_prod;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos vendidos: ");
        quant_prod = entrada.nextInt();
        System.out.print("Digite o valor da compra:");
        valor_compra = entrada.nextDouble();
        entrada.close ();

        if (valor_compra < 10.00)
        {
            valor_venda = valor_compra+(valor_compra*70/100);
            lucro = valor_venda - valor_compra;
            System.out.println ("Valor da venda: " + valor_venda);
            System.out.println ("Porcentagem de acréscimo: 70%");
            System.out.println ("Lucro obtido: " + lucro);
            
        }
        else if ((valor_compra >= 10.00) || (valor_compra <= 30.00))
        {
            valor_venda = valor_compra + (valor_compra*50/100);
            lucro = (valor_venda - valor_compra)*quant_prod;
            System.out.println ("Valor da venda: " + valor_venda);
            System.out.println ("Porcentagem de acréscimo: 50%");
            System.out.println ("Lucro obtido: " + lucro);
        }
        else if ((valor_compra >= 30.01) || (valor_compra <= 50.00))
        {
            valor_venda = valor_compra + (valor_compra*40/100);
            lucro = valor_venda - valor_compra;
            System.out.println ("Valor da venda: " + valor_venda);
            System.out.println ("Porcentagem de acréscimo: 40%");
            System.out.println ("Lucro obtido: " + lucro);
        }
        else
        {
            valor_venda = valor_compra+(valor_compra*30/100);
            lucro = valor_venda - valor_compra;
            System.out.println ("Valor da venda: " + valor_venda);
            System.out.println ("Porcentagem de acréscimo: 30%");
            System.out.println ("Lucro obtido: " + lucro);
        }

        

        
    }
    
}
