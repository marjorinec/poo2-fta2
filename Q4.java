import java.util.Scanner;
import java.util.Arrays; 

public class Q4 {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int qtdNumeros = 0;
    int[] numeros;

    System.out.println("Quantas números serão adicionadao?");
    qtdNumeros = scan.nextInt();

    numeros = new int[qtdNumeros];

    for (int indice = 0; indice < qtdNumeros; indice++) {
      System.out.printf("Digite o %d° número: ", indice+1);
      numeros[indice] = scan.nextInt();
    }

    Arrays.sort(numeros);

    System.out.printf("Números ordenados: %s", Arrays.toString(numeros));

  }
}