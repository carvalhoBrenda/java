import javax.swing.JOptionPane;

public class exercicio3 {

    public static void main (String [] args){
        String nome;
        Double sal_atual, sal_reajuste;

        JOptionPane.showMessageDialog(null, "Reajuste Salarial");
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        sal_atual = Double.parseDouble(JOptionPane.showInputDialog("Digite sua salário atual:"));

        if ((sal_atual >= 0.01) && (sal_atual <= 1000.00))
        {
            sal_reajuste = sal_atual+(sal_atual*20/100);
            JOptionPane.showMessageDialog(null, nome + " . Salário atual: " + sal_atual + " . Salário reajustado: " + sal_reajuste);
        }
        else if ((sal_atual >= 1000) && (sal_atual <= 5000.00))
        {
            sal_reajuste = sal_atual+(sal_atual*10/100);
            JOptionPane.showMessageDialog(null, nome + " . Salário atual: " + sal_atual + " . Salário reajustado: " + sal_reajuste);
        }
        else 
        {
            sal_reajuste = sal_atual+(sal_atual*5/100);
            JOptionPane.showMessageDialog(null, nome + " . Salário atual: " + sal_atual + " . Salário reajustado: " + sal_reajuste);
        }



    }
}
