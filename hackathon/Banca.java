package hackathon;
import java.util.Map;
public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;
    public Banca(Projeto projetoAvaliado, Map<Jurado, Integer> jurados) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = jurados;
    }
    @Override
    public void calcularNotaFinal() {
        int soma = jurados.values().stream().mapToInt(Integer::intValue).sum();
        int media = soma / jurados.size();
        projetoAvaliado.setNotaFinal(media);
    }
    public Projeto getProjetoAvaliado() { return projetoAvaliado; }
}
