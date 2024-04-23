package entidades;

public class Produtos {
	private String nome;
	private double preco;
	private int quantidade;
	
	//CONSTRUTOR OBJ padrão
	public Produtos() {	
	}
	
	//CONSTRUTOR OBJ completo
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//CONSTRUTOR OBJ sem quantidade
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double total() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// Objeto convertido para String
	public String toString() {
		return "Nome: "
			+ nome
			+ "\nPreço: $"
			+ String.format("%.2f", preco)
			+ "\nQuantidade: "
			+ quantidade
			+ "\nTotal: $"
			+ String.format("%.2f\n", total());
	}

}
