package interfaces;

import dados.Chave;

public interface IRepositorioChaves {
	void adicionar(Chave c);
	void remover(Chave c);
	boolean existe(Chave c);
	Chave buscar(int id);
}
