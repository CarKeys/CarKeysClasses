package dados;

public abstract class Produto {
	private static int geradorId;
	private int id;
	private double valor;
	
	public Produto() {
		geradorId++;
		id = geradorId;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}
