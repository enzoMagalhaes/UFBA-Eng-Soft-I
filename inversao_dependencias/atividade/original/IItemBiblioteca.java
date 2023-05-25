package br.ufba.isp;

import java.time.LocalDateTime;

public interface IItemBiblioteca {
    public void emprestar(String usuarioEmprestimo);
    public void devolver();
    public LocalDateTime getDataDevolver();

	public String getIdItemBiblioteca();
	public void setIdItemBiblioteca(String idItemBiblioteca);

	public String getTitulo();
	public void setTitulo(String titulo);

	public String getAutor();
	public void setAutor(String autor);

	public int getNumeroPaginas();
	public void setNumeroPaginas(int numeroPaginas);

	public int getDuracaoEmprestimoEmDias();
	public void setDuracaoEmprestimoEmDias(int duracaoEmprestimoEmDias);

	public String getUsuarioEmprestimo();
	public void setUsuarioEmprestimo(String usuarioEmprestimo);

	public LocalDateTime getDataEmprestimo();
	public void setDataEmprestimo(LocalDateTime dataEmprestimo);
}
