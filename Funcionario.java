public class Funcionario { //Exercício 14
	private static int mat_aux=0; // mat_aux passa a ser um contador de objetos da classe
	private int mat;  // mat passa a ser variável de instancia
	private String nome, funcao;
	private double salario;
	
	public Funcionario() {
    mat = ++mat_aux;  
	}
	
	public Funcionario(String nome_aux, String funcao_aux, double sal_aux) {
    this();  // Isto faz com que o construtor acima seja chamado incrementando mat
    nome = nome_aux;
    funcao = funcao_aux;
    salario = sal_aux;
	}
	// Solução da questão 14
  public Funcionario(String nome_aux, String funcao_aux) {
	 this(nome_aux, funcao_aux, 0); // Isto faz com que o construtor acima seja chamado com salario = 0
	}
	// Fim da solução da questão 14

	public int getMat() { // Não é mais estático devido a mat deixar de ser
    return mat;
	}
	
	public void setNome(String nome) {
    this.nome = nome;
	}
	
	public String getNome() {
    return nome;
	}
	
	public void setFuncao(String funcao) {
    this.funcao = funcao;
	}
	
	public String getFuncao() {
    return funcao;
	}
	
	public void setSalario(double salario) {
    this.salario = salario;
	}
	
	public double getSalario() {
    return salario;
	}
}