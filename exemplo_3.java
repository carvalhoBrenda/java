//variáveis do tipo texto = string, tipo inteiro = int e tipo inteiro = double

public class Main
{
	public static void main(String[] args) {
		String nome;
		int idade;
		double peso, altura;
		double imc;
		
		nome = "Maria";
		idade = 17;
		peso = 62.50;
		altura = 1.65;
		imc = peso/(altura*altura);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: "+ altura);
		System.out.println("IMC: " + imc);
	}
}
