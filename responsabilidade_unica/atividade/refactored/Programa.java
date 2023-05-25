package br.ufba.srp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Seja bem-vinda ou bem-vindo.");
		
		// Obtém dados da pessoa
		Pessoa usuario = new Pessoa();
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Qual é seu primeiro nome?");
		usuario.setPrimeiroNome(teclado.readLine());
		
		System.out.println("Qual é seu último nome?");
		usuario.setUltimoNome(teclado.readLine());

		
		// Verifica se os nomes são válidos
		if (usuario.getPrimeiroNome().isEmpty()) {
			System.out.println("Você não forneceu um primeiro nome válido");
			teclado.readLine();
			return;
		}
		
		if (usuario.getUltimoNome().isEmpty()) {
			System.out.println("Você não forneceu um último nome válido");
			teclado.readLine();
			return;
		}
		
		// Cria um id para o usuário
		System.out.println("Seu id de usuário é " + usuario.getPrimeiroNome().substring(0, 1) + usuario.getUltimoNome());
	
		teclado.readLine();
		
	}

}