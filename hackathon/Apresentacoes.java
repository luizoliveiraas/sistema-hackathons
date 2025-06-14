package hackathon;
import java.util.ArrayList;
import java.util.List;
public class Apresentacoes {
    private static Apresentacoes instance;
    private List<Apresentacao> apresentacoes = new ArrayList<>();
    private Apresentacoes() {}
    public static Apresentacoes getInstance() {
        if (instance == null) instance = new Apresentacoes();
        return instance;
    }
    public void adicionar(Apresentacao apresentacao) { apresentacoes.add(apresentacao); }
    public List<Apresentacao> getApresentacoes() { return apresentacoes; }
}
