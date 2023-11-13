
public class Pessoa {
	String nome;
	int idade;
	
	public void cadastrarPessoa(String nome,int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public void fazAniversario() {
		this.idade = this.idade+1;
	}
	public void imprimirIdade() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
	}
}
