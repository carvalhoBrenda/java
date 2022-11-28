import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args) {
    

        //criação do objeto
        Pessoa pessoa1 = new Pessoa();
    
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
    
        //chamada do metodo com passagem de parâmetro e com retorno
        double imc = pessoa1.calcularIMC(peso, altura);
        System.out.println("IMC = " + imc);

    }
}

