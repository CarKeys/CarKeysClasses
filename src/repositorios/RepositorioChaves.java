package repositorios;

import java.util.ArrayList;
import java.util.List;

import dados.Chave;
import interfaces.IRepositorioChaves;

public class RepositorioChaves implements IRepositorioChaves {

	List<Chave> chaves;
	
	public RepositorioChaves() {
		chaves = new ArrayList<Chave>();
	}
	
	@Override
	public void adicionar(Chave c) {
		chaves.add(c);
	}

	@Override
	public void remover(Chave c) {
		if(c!=null) {
			chaves.remove(c);
		}
	}

	@Override
	public boolean existe(Chave c) {
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
