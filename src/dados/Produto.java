package dados;

public abstract class Produto {
	private static int geradorId;
	private int id;
	private String modelo;
	private double preco;
	
	//	construtor para adicao de chave
	public Produto(String modelo, double preco) {
		geradorId++;
		id = geradorId;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	//	construtor para adicao de carro
	public Produto(String modelo) {
		geradorId++;
		id = geradorId;
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
