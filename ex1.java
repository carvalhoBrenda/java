import javax.swing.JOptionPane;

public class ex1 {

    public static void main(String[] args) {
        Double p, e, m;

        p = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso dos peixes pescados: "));
		

        if (p > 50)
        {
            e = p - 50;
            m = e * 4;
            JOptionPane.showMessageDialog(null, "Excesso: " + e + " Multa: " + m);         
        }
        else 
        {
            e = 0.0;
            m = 0.0;
            JOptionPane.showMessageDialog(null, "Excesso: " + e + " Multa: " + m);

        }
        
        

        
    }
    
}
