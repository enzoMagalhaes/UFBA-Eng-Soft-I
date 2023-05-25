// package modelo;
package aberto_fechado.atividade.refactored;

public class Candidato {

	private String nome;
	private String sobrenome;
	
	public Candidato(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}	
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
}
