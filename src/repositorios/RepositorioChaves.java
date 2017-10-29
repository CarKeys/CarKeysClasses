package repositorios;

import java.util.ArrayList;
import java.util.List;

import dados.Chave;
import dados.Produto;
import interfaces.IRepositorio;

public class RepositorioChaves implements IRepositorio {

	List<Chave> chaves;
	
	public RepositorioChaves() {
		chaves = new ArrayList<Chave>();
	}
	
	@Override
	public void adicionar(Produto c) {
		chaves.add((Chave) c);
	}

	@Override
	public void remover(Produto c) {
		if(c!=null) {
			chaves.remove(c);
		}
	}

	@Override
	public boolean existe(Produto c) {
		if(c == null) {
			return false;
		}
		return chaves.contains(c);
	}

	@Override
	public Chave buscar(int id) {
		for(Chave c : chaves) {
			if(c.getId() == id) {
				return c;
			}
		}
		return null;
	}

}
