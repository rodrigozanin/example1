package br.example;

import br.example.model.Carro;

public class Main {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		meuCarro.nome = "P�lio";
		meuCarro.cor = "Preto";
		meuCarro.marca = "Fiat";
		System.out.println("O nome do carro �: " + meuCarro.nome);
		
		
	}
}
