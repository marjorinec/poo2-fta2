import java.util.Scanner;

public class Q6 {

  public Funcionario[] criaFuncionario() {
    Scanner scan = new Scanner(System.in);
    Funcionario[] listaFuncionarios = new Funcionario[10];
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
    return listaFuncionarios;
  }

  public int checaFuncionario(Funcionario func) {
    Funcionario[] listaFuncionarios= criaFuncionario();
    for (int i = 0; i < 10; i++) {
      if (listaFuncionarios[i].getNome().equals(func.getNome())) {
        return i;
      }
    }
    return -1;
  }
}