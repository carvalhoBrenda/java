import java.util.Scanner;

public class Main
{

  public static void main (String[]args)
  {
    String categoria, nome;
    Double salario, aumento, salario_aumento;

    Scanner entrada = new Scanner (System.in);

      System.out.println ("Digite seu nome: ");
      nome = entrada.nextLine ();

      System.out.println ("Digite sua categoria: ");
      categoria = entrada.nextLine ();

      System.out.println ("Digite seu salC!rio: ");
      salario = entrada.nextDouble ();

      entrada.close ();

    if ((categoria.equals ("a")) || (categoria.equals ("c"))
	|| (categoria.equals ("f")) || (categoria.equals ("h")))
      {
	aumento = salario * 10 / 100;
	salario_aumento = salario + (salario * 10 / 100);

	System.out.println ("Nome: " + nome);
	System.out.println ("Valor do aumento: " + aumento);
	System.out.println ("Porcentagem de aumento: 10%");
	System.out.println ("SalC!rio reajustado: " + salario_aumento);
      }
    else if ((categoria.equals ("b")) || (categoria.equals ("d"))
	     || (categoria.equals ("e")) || (categoria.equals ("i"))
	     || (categoria.equals ("j")) || (categoria.equals ("t")))
      {
	aumento = salario * 15 / 100;
	salario_aumento = salario + (salario * 15 / 100);

	System.out.println ("Nome: " + nome);
	System.out.println ("Valor do aumento: " + aumento);
	System.out.println ("Porcentagem de aumento: 15%");
	System.out.println ("SalC!rio reajustado: " + salario_aumento);
      }
    else if ((categoria.equals ("k")) || (categoria.equals ("r")))
      {
	aumento = salario * 25 / 100;
	salario_aumento = salario + (salario * 25 / 100);

	System.out.println ("Nome: " + nome);
	System.out.println ("Valor do aumento: " + aumento);
	System.out.println ("Porcentagem de aumento: 25%");
	System.out.println ("SalC!rio reajustado: " + salario_aumento);
      }
    else if ((categoria.equals ("l")) || (categoria.equals ("m"))
	     || (categoria.equals ("n")) || (categoria.equals ("o"))
	     || (categoria.equals ("p")) || (categoria.equals ("q"))
	     || (categoria.equals ("s")))
      {
	aumento = salario * 35 / 100;
	salario_aumento = salario + (salario * 35 / 100);

	System.out.println ("Nome: " + nome);
	System.out.println ("Valor do aumento: " + aumento);
	System.out.println ("Porcentagem de aumento: 35%");
	System.out.println ("SalC!rio reajustado: " + salario_aumento);
      }
    else if ((categoria.equals ("u")) || (categoria.equals ("v"))
	     || (categoria.equals ("x")) || (categoria.equals ("y"))
	     || (categoria.equals ("w")) || (categoria.equals ("z")))
      {
	aumento = salario * 50 / 100;
	salario_aumento = salario + (salario * 50 / 100);

	System.out.println ("Nome: " + nome);
	System.out.println ("Valor do aumento: " + aumento);
	System.out.println ("Porcentagem de aumento: 50%");
	System.out.println ("SalC!rio reajustado: " + salario_aumento);
      }
  }
}
