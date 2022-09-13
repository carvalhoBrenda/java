import javax.swing.JOptionPane;

public class ExCxEntrada{
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nome;
        int numero;

            JOptionPane.showMessageDialog(null, "Entre com alguns dados");
            nome = JOptionPane.showInputDialog("Digite seu nome:");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            JOptionPane.showMessageDialog(null, nome + "Você digitou o número" + numero);

            switch (numero)
            {
                case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
                case 2:
                JOptionPane.showMessageDialog(null, "Segunda-feira");
                break;
                case 3:
                JOptionPane.showMessageDialog(null, "Terça-feira");
                break;
                case 4:
                JOptionPane.showMessageDialog(null, "Quarta-feira");
                break;
                case 5:
                JOptionPane.showMessageDialog(null, "Quinta-feira");
                break;
                case 6:
                JOptionPane.showMessageDialog(null, "Sexta-feira");
                break;
                case 7:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
                default:
                JOptionPane.showMessageDialog(null, "inválido");
                break;                
            }
    }
}