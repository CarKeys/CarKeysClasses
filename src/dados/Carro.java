package dados;

import java.util.ArrayList;
import java.util.List;

public class Carro extends Produto {
	private List<Chave> chavesCompativeis;
	private int ano;

	public Carro(String modelo, int ano) {
		super(modelo);
		this.ano = ano;
		chavesCompativeis = new ArrayList<Chave>();
	}
	
	public int getAno() {
		return ano;
	}

	public List<Chave> getChavesCompativeis() {
		return chavesCompativeis;
	}
	
	public void adicionarChaveCompativel(Chave chave) {
		chavesCompativeis.add(chave);
	}
}
