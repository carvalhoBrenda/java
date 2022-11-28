package ex02;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Triangulo figura = new Triangulo();

        figura.lerValores();

        double area = figura.calculaArea();
        JOptionPane.showMessageDialog(null, "Área: " + area);

        
    }
    
    
}
