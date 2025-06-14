package hackathon;
import java.util.ArrayList;
import java.util.List;
public class Equipes {
    private static Equipes instance;
    private List<Equipe> equipes = new ArrayList<>();
    private Equipes() {}
    public static Equipes getInstance() {
        if (instance == null) instance = new Equipes();
        return instance;
    }
    public void adicionar(Equipe equipe) { equipes.add(equipe); }
    public List<Equipe> getEquipes() { return equipes; }
}
