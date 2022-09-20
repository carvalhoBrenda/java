import javax.swing.JOptionPane;

public class ex2 {

    public static void main(String[] args) {
        Double salario_base, descontos, vendas_internas, vendas_externas, total_vendas, comissao, resultado, salario_liquido;

        salario_base = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base: "));
		descontos = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos descontos: "));
        vendas_externas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das vendas internas: "));
        vendas_internas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das vendas externas: "));

        total_vendas = vendas_externas+vendas_internas;

        if (total_vendas >= 2000)
        {
            comissao = total_vendas*6/100;
            salario_liquido = (salario_base - descontos) + comissao;
            JOptionPane.showMessageDialog(null, "Resultado: Acima da meta.");
            JOptionPane.showMessageDialog(null, "Salário Liquido: " + salario_liquido);
          
        }
        else 
        {
            comissao = total_vendas*3/100;
            salario_liquido = (salario_base - descontos) + comissao;
            JOptionPane.showMessageDialog(null, "Resultado: Abaixo da meta.");
            JOptionPane.showMessageDialog(null, "Salário Liquido: " + salario_liquido);

        }
        
        

        
    }
    
}
