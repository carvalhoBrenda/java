import javax.swing.JOptionPane;

public class ex3 {

    public static void main(String[] args) {
        Double creditos, debitos, saldo, saldo_atual, taxa;
        String nome, tipo_cliente;

        nome = JOptionPane.showInputDialog("Digite seu nome: ");
		creditos = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos seus créditos: "));
        debitos = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos seus débitos: "));

        saldo = creditos - debitos;

        if (saldo <= 1000)
        {
            taxa = saldo*15/100;
            saldo_atual= saldo - taxa;
            JOptionPane.showMessageDialog(null, "Saldo: " + saldo + "Tipo de Cliente: Comum. Valor da taxa: " + taxa + "Saldo atual: " + saldo_atual);
          
        }
        else if ((saldo >= 1000) && (saldo <= 2000))
        {
            taxa = saldo*10/100;
            saldo_atual= saldo - taxa;
            JOptionPane.showMessageDialog(null, "Saldo: " +  saldo + "Tipo de Cliente: Especial. Valor da taxa: " + taxa + "Saldo atual: " + saldo_atual);
          
        }
        else 
        {
            taxa = saldo*5/100;
            saldo_atual= saldo - taxa;
            JOptionPane.showMessageDialog(null, "Saldo: " +  saldo + "Tipo de Cliente: Super Especial. Valor da taxa: " + taxa + "Saldo atual: " + saldo_atual); 
        }
                
    }
    
}
