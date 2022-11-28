public class Pessoa {

    //trocar a palavra void pelo tipo de dado do retorno
    //metodo com passagem de parametro e com retorno

    public double calcularIMC(double peso, double altura)
    {
        double imc = peso/(altura*altura);
        return imc; //variavel imc esta sendo retornada para a classe principal
    }
    
}
