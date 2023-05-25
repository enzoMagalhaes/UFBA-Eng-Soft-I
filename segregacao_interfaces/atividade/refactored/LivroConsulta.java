package br.ufba.isp;

import java.time.LocalDateTime;

public class LivroConsulta implements IItemBiblioteca {
    public String idItemBiblioteca;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public void emprestar(String usuarioEmprestimo) {
            	
    }

    public void devolver() {
        
    }

    public LocalDateTime getDataDevolver() {
    	return LocalDateTime.of(1900, 1, 1, 0, 0);
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
        return 0;
	}

	public void setDuracaoEmprestimoEmDias(int duracaoEmprestimoEmDias) {
        
	}

	public String getUsuarioEmprestimo() {
        return "";
	}

	public void setUsuarioEmprestimo(String usuarioEmprestimo) {
        
	}

	public LocalDateTime getDataEmprestimo() {
        return LocalDateTime.of(1900, 1, 1, 0, 0);
	}

	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        
	}
}
