import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[][] matriz = new int[5][5];
		int[] diagonalPrincipal = new int[5];
		
		System.out.printf("Matriz 5x5\nDigite os números para preenchê-la: \n");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				matriz[i][j] = scan.nextInt();
				
				if (i == j) {
					diagonalPrincipal[i] = matriz[i][j];
				}
			}
		}
		
		System.out.println("\nElementos da diagonal principal:");
		for(int i=0; i<5; i++) {
			System.out.printf("[%d]", diagonalPrincipal[i]);
		}

  }
}