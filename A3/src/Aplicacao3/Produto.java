package Aplicacao3;

public class Produto {
	private String nome;
	private double preco;
	
	//CONSTRUTOR 0
	public Produto() {
		nome = "Nome não informado";
		preco = 0.0;
	}
	
	//CONSTRUTOR 1
	public Produto(String nome, double preço) {
		this.nome = nome;
		this.preco = preço;
	}
	
	//RETORNA NOME E PREÇO
	public String toString() {
		return "Produto : " + nome + " - Preço: R$" + preco;
	}
	
	//REAJUSTE DE 10%
	public double reajustaPreço(double percentual) {
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
	
	//GET PREÇO
	public Double getPreço() {
		return preco;
	}
	
	//SET NOME
	public void setPreço(Double preço) {
		this.preco = preço;
	}
	
}
