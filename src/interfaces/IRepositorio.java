package interfaces;

import dados.Produto;

public interface IRepositorio {
	void adicionar(Produto p);
	void remover(Produto p);
	boolean existe(Produto p);
	Produto buscar(int id);
}
