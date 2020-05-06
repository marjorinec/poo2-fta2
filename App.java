import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Q8 metodos = new Q8();
    int opcao = 0;
    boolean funcionariosCriados = false;
    String nome;
    int funcPosicao;
    boolean fecharProg = false;
    
    System.out.println("Sistema de gerenciamento de funcionários");
    System.out.println("Primeiramente, digite 1 para cadastrar 10 funcionários");

    opcao = scan.nextInt();

    while (!funcionariosCriados) {
      if (opcao == 1) {
        metodos.criaFuncionarios();
        funcionariosCriados = true;
      } else {
        System.out.println("Primeiramente, digite 1 para cadastrar 10 funcionários");
        opcao = scan.nextInt();
      }
    }
    
    while (!fecharProg) {
      System.out.println("Digite 2 para buscar um funcionário");
      System.out.println("Digite 3 para aumentar o(s) salário(s) de funcionário(s) que recebem menos do que 1000 em 10%");
      System.out.println("Digite 4 para exibir a lista de funcionários cadastrados");
      System.out.println("Digite 5 para encerrar o programa.");
      opcao = scan.nextInt();

      switch(opcao) {
        case 2:
          System.out.println("Digite o nome do funcionário");
          nome = scan.next();

          funcPosicao = -1;

          for (int i = 0; i < 10; i++) {
            if (metodos.listaFuncionarios[i].getNome().equals(nome)) {
              System.out.printf("O funcionário está na posição %d", i);
              funcPosicao = i;
              break;
            }
          }
          
          if (funcPosicao == -1) {
            System.out.println("Funcionário não encontrado");
          }

          break;

        case 3:
          metodos.aumentaSalario();
          System.out.println("Salários aumentados.");
          break;

        case 4:
          metodos.exibirInfosFuncionarios();
          break;

        case 5:
          fecharProg = true;
          break;
      }
    }
  }
}