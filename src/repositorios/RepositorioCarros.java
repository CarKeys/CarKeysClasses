package repositorios;

import java.util.ArrayList;
import java.util.List;

import dados.Carro;
import dados.Produto;
import interfaces.IRepositorio;

public class RepositorioCarros implements IRepositorio{
	private List<Carro> carros;
	
	public RepositorioCarros() {
		carros = new ArrayList<Carro>();
	}

	@Override
	public void adicionar(Produto p) {
		carros.add((Carro) p);
	}

	@Override
	public void remover(Produto p) {
		carros.remove((Carro) p);
	}

	@Override
	public boolean existe(Produto p) {
		if(p == null) {
			return  false;
		}
		return carros.contains(p);
	}

	@Override
	public Produto buscar(int id) {
		for(Carro c : carros) {
			if(c.getId() == id) {
				return c;
			}
		}
		return null;
	}
}
