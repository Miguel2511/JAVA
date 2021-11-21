package Aplicacao3;

public class Produto {
	private String nome;
	private double preco;
	
	//CONSTRUTOR 0
	public Produto() {
		nome = "Nome n�o informado";
		preco = 0.0;
	}
	
	//CONSTRUTOR 1
	public Produto(String nome, double pre�o) {
		this.nome = nome;
		this.preco = pre�o;
	}
	
	//RETORNA NOME E PRE�O
	public String toString() {
		return "Produto : " + nome + " - Pre�o: R$" + preco;
	}
	
	//REAJUSTE DE 10%
	public double reajustaPre�o(double percentual) {
		percentual = percentual / 100;
		preco = (preco * percentual) + preco;
		return preco;
	}
	
	//GET NOME
	public String getNome(){
		return nome;
	}
	
	//SET NOME
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//GET PRE�O
	public Double getPre�o() {
		return preco;
	}
	
	//SET NOME
	public void setPre�o(Double pre�o) {
		this.preco = pre�o;
	}
	
}
