package Aplicacao3;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p1 = new Produto();
		String nome;
		double preco;
		double reajuste;
		
		//PRODUTO 1
		System.out.println("Informe o nome e depois pre�o do produto: ");
		nome = sc.next();
		preco = sc.nextDouble();
		Produto p = new Produto(nome, preco);
		System.out.println("Informe o percentual de reajuste: ");
		reajuste = sc.nextDouble();
		System.out.println(p.toString()+"\n"+"Reajuste: R$"+p.reajustaPre�o(reajuste)+"\n ");
		
		//PRODUTO 2
		System.out.println("Informe o nome do segundo produto: ");
		nome = sc.next();
		p1.setNome(nome);
		System.out.println("Informe o pre�o do segundo produto: ");
		preco = sc.nextDouble();
		p1.setPre�o(preco);
		System.out.println("Informe o percentual de reajuste: ");
		reajuste = sc.nextDouble();
		System.out.println(p1.toString()+"\n" + "Reajuste: R$"+p1.reajustaPre�o(reajuste));
		
		sc.close();

	}

}
	