package ex02;

import javax.swing.JOptionPane;

public class Triangulo {

    //variáveis públicas da classe
    double base, altura, area;

    //metodo sem passagem e sem retorno
    public void lerValores()
    {
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));

    }

    //método sem passagem de parâmetro com retorno
    //no lugar da palavra void(vazio) coloca-se o tipo de variável
    public double calculaArea()
    {
        area = (base*altura)/2;
        return area;
    }
    
}
