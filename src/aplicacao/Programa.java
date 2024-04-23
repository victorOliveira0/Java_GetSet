package aplicacao;

//import java.util.Locale;

import java.util.Scanner;

import entidades.Produtos;

public class Programa {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		// CADASTRO
		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();

		Produtos produtos = new Produtos(nome, preco, quantidade);
		
		// IMPRESSÃO
		System.out.println(produtos);

		// ADD quantidade
		System.out.print("Adicionar quantidade: ");
		quantidade = sc.nextInt();
		produtos.addProdutos(quantidade);

		// IMPRESSÃO
		System.out.println();
		System.out.println("Atualização\n" + produtos);
		
		// REMOVE quantidade
		System.out.println();
		System.out.print("Remover quantidade: ");
		quantidade = sc.nextInt();
		produtos.removeProdutos(quantidade);
		
		// IMPRESSÃO
		System.out.println();
		System.out.println("Atualização\n" + produtos);

		//ALTERAÇÃO DE NOME E PREÇO
		System.out.println("Alterar o nome: ");
		sc.nextLine();
		String novoNome = sc.nextLine();
		produtos.setNome(novoNome);
		
		System.out.println("Alterar o preço: ");
		double novoPreco = sc.nextDouble();
		produtos.setPreco(novoPreco);

		// IMPRESSÃO
		System.out.println();
		System.out.println("Atualização\n" + produtos);

		
		// IMPRESSÃO
		System.out.println();
		System.out.println("Atualização\n" + produtos);
		
		sc.close();

	}

}
