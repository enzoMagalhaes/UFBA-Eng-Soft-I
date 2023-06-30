package br.ufba.isp;

import java.time.LocalDateTime;

public class Livro implements IItemBiblioteca {
    public String idItemBiblioteca;
    public String titulo;
    public String autor;
    public int numeroPaginas;
    public int duracaoEmprestimoEmDias = 21;
    public String usuarioEmprestimo;
    public LocalDateTime dataEmprestimo;

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
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
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
}
