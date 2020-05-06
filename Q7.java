import java.util.Scanner;

public class Q7 {
  static Funcionario[] listaFuncionarios = new Funcionario[10];

  public void criaFuncionario() {
    Scanner scan = new Scanner(System.in);
    String nome;
    String funcao;
    double salario;

    for (int i = 0; i < 10; i++) {
      System.out.println("Cadastro de funcionários");
      System.out.print("Digite o nome: ");
      nome = scan.next();
      System.out.print("Digite a função: ");
      funcao = scan.next();
      System.out.print("Digite o salário: ");
      salario = scan.nextDouble();
      
      listaFuncionarios[i] = new Funcionario(nome, funcao, salario);
    }
  }

  public int checaFuncionario(Funcionario func) {
    for (int i = 0; i < 10; i++) {
      if (listaFuncionarios[i].getNome().equals(func.getNome())) {
        return i;
      }
    }
    return -1;
  }

  public void aumentaSalario() {
    for (int i = 0; i < 10; i++) {
      if (listaFuncionarios[i].getSalario() < 1000) {
        listaFuncionarios[i].setSalario(listaFuncionarios[i].getSalario() * 1.1);
      }
    }
  }

}