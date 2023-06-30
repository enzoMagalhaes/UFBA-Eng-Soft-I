// package modelo;
package  aberto_fechado.atividade.original;


public class CriadorContas {
    public Empregado criar(Candidato candidato)
    {
        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        empregado.setEmail(candidato.getNome().substring(0, 1) + candidato.getSobrenome() + "@xpto.com");
        
        return empregado;
    }
}
