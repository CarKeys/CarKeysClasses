package dados;

import java.util.ArrayList;
import java.util.List;

public class Chave extends Produto {
	private List<Carro> carrosCompativeis;

	public Chave(String modelo, double preco) {
		super(modelo, preco);
		carrosCompativeis = new ArrayList<Carro>();
	}
	
	public List<Carro> getCarrosCompativeis() {
		return carrosCompativeis;
	}

	public void adicionarCarroCompativel(Carro carro) {
		carrosCompativeis.add(carro);
	}
}
