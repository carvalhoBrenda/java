import javax.swing.JOptionPane;

public class exercicio2 {

    /**
     * @param args
     */
    public static void main (String[] args){
        Double altura, peso;
		Double imc;

            JOptionPane.showMessageDialog(null, "Calculadora de IMC");
			peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));

			imc = peso/(altura*altura);

			if ((imc >= 0) && (imc <= 18.9))
			{
				JOptionPane.showMessageDialog(null, "IMC: " + imc + " . Resultado: Muito magro");
			}
			else if ((imc >= 19) && (imc <= 24.9))
			{
				JOptionPane.showMessageDialog(null, "IMC: " + imc + " . Resultado: Normal");
			}
			else if ((imc >= 25) && (imc <= 29.9))
			{
				JOptionPane.showMessageDialog(null, "IMC: " + imc + " . Resultado: Sobrepeso");
			}
			else if ((imc >= 30) && (imc <= 39.9))
			{
				JOptionPane.showMessageDialog(null, "IMC: " + imc + " . Resultado: Obeso");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "IMC: " + imc + " . Resultado: Obesidade grave");
			}
		






    }
    
}
