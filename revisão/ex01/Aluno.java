package ex01;
import javax.swing.JOptionPane;
public class Aluno {

    //variáveis públicas, visíveis em qualquer método da mesma classe
    String nome;
    double nota1, nota2, media;

    //criação do método sem parâmetro e sem retorno, por isso o void
    public void cadastrar()
    {
        nome = JOptionPane.showInputDialog(null, "Nome: ");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segunda nota: "));
    }

    public void calcularMedia()
    {
        media = (nota1 + nota2)/2;
    }

    public void imprimir(String curso, String modulo, String periodo)
    {
        JOptionPane.showMessageDialog(null, "Aluno: " + nome + " Média: " + media + " Curso: " + curso + " Módulo: " + modulo + " Período: " + periodo);
    }
    
}
