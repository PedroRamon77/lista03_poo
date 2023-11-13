
public class Funcionario {
	String nome;
	double salario;
	String data_entrada;
	String rg;
	boolean situacao;
	Departamento departamento;

	public void cadastrarFuncionario(String nome,double salario,String data,String rg,Departamento dep) {
		this.nome = nome;
		this.salario = salario;
		this.data_entrada = data;
		this.rg = rg;
		this.departamento = dep;
		this.situacao = true;
	}
	public void bonifica(double bonus) {
		this.salario = this.salario+bonus;
		System.out.println("Funcionario recebeu um BONUS!");
	}
	public void imprimirFuncionario() {
		System.out.println("**** Dados do Funcionario ****");
		System.out.println("Nome: "+this.nome);
		System.out.println("Salário: "+this.salario);
		System.out.println("RG: "+this.rg);
		System.out.println("Data de entrada: "+this.data_entrada);
		System.out.println("Departamento: "+this.departamento.descricao);
	}
	public void demitir() {
		this.situacao = false;
		System.out.println("Funcionario DEMITIDO!");
	}
	public void situacaoFuncionario() {
		if(this.situacao==true) {
			System.out.println("Situação: ATIVA");
		}else {
			System.out.println("Situação: INATIVA");
		}
	}
}

