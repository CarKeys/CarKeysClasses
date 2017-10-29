package testes;

import dados.Chave;
import repositorios.RepositorioChaves;

public class Programa {

	public static void main(String[] args) {
		RepositorioChaves cs = new RepositorioChaves();
		Chave c = new Chave("Yale", 5);
		
		cs.adicionar(c);
		System.out.println("Primeira chave: " + cs.buscar(c.getId()).getModelo());
	}

}
