import java.util.Scanner;

public class Q8 {
  Funcionario[] listaFuncionarios = new Funcionario[10];

  public void criaFuncionarios() {
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

  public void exibirInfosFuncionarios() {
    System.out.println("Dados de funcionários");
    for (int i = 0; i < 10; i++) {
      System.out.println("Matrícula: " + listaFuncionarios[i].getMat());
      System.out.println("Nome: " + listaFuncionarios[i].getNome());
      System.out.println("Função: " + listaFuncionarios[i].getFuncao());
      System.out.println("Salário: " + listaFuncionarios[i].getSalario());
    }
  }
  
}