import java.util.Scanner;

public class Q5 {

  public void criaFuncionario() {
    Scanner scan = new Scanner(System.in);
    Funcionario[] funcionarios = new Funcionario[10];
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
      
      funcionarios[i] = new Funcionario(nome, funcao, salario);
    }

  }
}