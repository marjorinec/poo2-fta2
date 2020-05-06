import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int qtdNotas = 0;
    float[] notas;
    float totalNotas = 0;
    float mediaTurma = 0;

    System.out.println("Quantas notas serão adicionadas?");
    qtdNotas = scan.nextInt();

    notas = new float[qtdNotas];

    for (int qtd = 0; qtd < qtdNotas; qtd++) {
      System.out.printf("Digite a %d° nota: ", qtd+1);
      notas[qtd] = scan.nextFloat();
      totalNotas += notas[qtd];
    }

    mediaTurma = totalNotas/qtdNotas;
    System.out.printf("A média da turma é: %.2f", mediaTurma);
  }
}