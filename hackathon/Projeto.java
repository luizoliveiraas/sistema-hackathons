package hackathon;
public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private int notaFinal;
    private String nome;
    public Projeto(String nome, Profissional orientador, Equipe equipe) {
        this.nome = nome;
        this.orientador = orientador;
        this.equipe = equipe;
    }
    public void setNotaFinal(int nota) { this.notaFinal = nota; }
    public int getNotaFinal() { return notaFinal; }
    public String getNome() { return nome; }
    public Equipe getEquipe() { return equipe; }
}
