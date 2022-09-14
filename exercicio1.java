import javax.swing.JOptionPane;

public class exercicio1{
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        int numero;

            JOptionPane.showMessageDialog(null, "Digite o código do produto para saber sua classificação");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do produto:"));

            switch (numero)
            {
                case 1:
                JOptionPane.showMessageDialog(null, "Alimento não-perecível");
                break;
                case 2:
                JOptionPane.showMessageDialog(null, "Alimento perecível");
                break;
                case 3:
                JOptionPane.showMessageDialog(null, "Vestuário");
                break;
                case 4:
                JOptionPane.showMessageDialog(null, "Higiene Pessoal");
                break;
                case 5:
                JOptionPane.showMessageDialog(null, "Limpeza e Utensílios Domésticos");
                break;
                default:
                JOptionPane.showMessageDialog(null, "Inválido");
                break;                
            }
    }
}