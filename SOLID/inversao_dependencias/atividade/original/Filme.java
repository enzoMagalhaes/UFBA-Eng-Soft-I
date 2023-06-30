package br.ufba.isp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Filme implements IItemBiblioteca {
    public String idItemBiblioteca;
    public String titulo;
    public int duracaoEmprestimoEmDias = 21;
    public String usuarioEmprestimo;
    public LocalDateTime dataEmprestimo;
    public int duracaoEmMinutos;
    public List<String> atores = new ArrayList<String>();

    public void emprestar(String usuarioEmprestimo) {
        this.usuarioEmprestimo = usuarioEmprestimo;
        this.dataEmprestimo = LocalDateTime.now();
    }

    public void devolver() {
        this.usuarioEmprestimo = "";
    }

    public LocalDateTime getDataDevolver() {
        return dataEmprestimo.plusDays(duracaoEmprestimoEmDias);
    }

	public String getIdItemBiblioteca() {
		return idItemBiblioteca;
	}

	public void setIdItemBiblioteca(String idItemBiblioteca) {
		this.idItemBiblioteca = idItemBiblioteca;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return "";
	}

	public void setAutor(String autor) {
		
	}

	public int getNumeroPaginas() {
		return 0;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		
	}

	public int getDuracaoEmprestimoEmDias() {
		return duracaoEmprestimoEmDias;
	}

	public void setDuracaoEmprestimoEmDias(int duracaoEmprestimoEmDias) {
		this.duracaoEmprestimoEmDias = duracaoEmprestimoEmDias;
	}

	public String getUsuarioEmprestimo() {
		return usuarioEmprestimo;
	}

	public void setUsuarioEmprestimo(String usuarioEmprestimo) {
		this.usuarioEmprestimo = usuarioEmprestimo;
	}

	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public List<String> getAtores() {
		return atores;
	}

	public void setAtores(List<String> atores) {
		this.atores = atores;
	}
	
}
