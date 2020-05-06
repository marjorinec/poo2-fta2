import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int qtdNumeros = 20;
    int numeros[] = new int[qtdNumeros];
    int maiorNumero = 0;
    int segundoMaiorNumero = 0;

    System.out.println("Digite 20 números.\n");

    for (int indice = 0; indice < 20; indice++) {
      System.out.printf("Digite o %d° número: ", indice+1);
      numeros[indice] = scan.nextInt();

      if (numeros[indice] > maiorNumero) {
        segundoMaiorNumero = maiorNumero;
        maiorNumero = numeros[indice];
      } else if (numeros[indice] > segundoMaiorNumero) {
        segundoMaiorNumero = numeros[indice];
      }
    }

    System.out.printf("O maior número é: %d\n", maiorNumero);
    System.out.printf("O segundo maior número é: %d", segundoMaiorNumero);


  }
}