
package ex01;
public class Principal{
    public static void main(String[] args) {

        //instanciação (criação do objeto aluno1)
        Aluno aluno1 = new Aluno();

        //executa o método cadastrar
        aluno1.cadastrar();

        //executa o método calcularMedia
        aluno1.calcularMedia();

        String curso = "Informática";
        String modulo = "2°";
        String periodo = "Noturno";
        //chama o método com passagem de parâmetro
        aluno1.imprimir(curso,modulo, periodo);
        
    }
}