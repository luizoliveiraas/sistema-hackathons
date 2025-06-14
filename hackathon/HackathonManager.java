package hackathon;
import java.util.*;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class HackathonManager {
    public static void main(String[] args) {
        Universidade u = new Universidade("UFABC");
        Profissional orientador1 = new Profissional("Prof. A", u);
        Profissional orientador2 = new Profissional("Prof. B", u);

        // Criar 2 equipes com 5 alunos cada
        List<Estudante> alunos1 = Arrays.asList(
            new Estudante("Aluno 1", u), new Estudante("Aluno 2", u),
            new Estudante("Aluno 3", u), new Estudante("Aluno 4", u),
            new Estudante("Aluno 5", u)
        );
        List<Estudante> alunos2 = Arrays.asList(
            new Estudante("Aluno 6", u), new Estudante("Aluno 7", u),
            new Estudante("Aluno 8", u), new Estudante("Aluno 9", u),
            new Estudante("Aluno 10", u)
        );
        Equipe equipe1 = new Equipe(alunos1);
        Equipe equipe2 = new Equipe(alunos2);
        Equipes.getInstance().adicionar(equipe1);
        Equipes.getInstance().adicionar(equipe2);

        // Adiciona um projeto diferente para cada equipe
        Projeto projeto1 = new Projeto("Projeto 1", orientador1, equipe1);
        Projeto projeto2 = new Projeto("Projeto 2", orientador2, equipe2);

        // Criar banca avaliadora para cada projeto (4 jurados)
        Jurado j1 = new Jurado("Jurado 1", u);
        Jurado j2 = new Jurado("Jurado 2", u);
        Jurado j3 = new Jurado("Jurado 3", u);
        Jurado j4 = new Jurado("Jurado 4", u);
        Jurado j5 = new Jurado("Jurado 5", u);
        Jurado j6 = new Jurado("Jurado 6", u);
        Jurado j7 = new Jurado("Jurado 7", u);
        Jurado j8 = new Jurado("Jurado 8", u);

        Map<Jurado, Integer> notas1 = new HashMap<>();
        notas1.put(j1, 8); notas1.put(j2, 7); notas1.put(j3, 9); notas1.put(j4, 6);
        Map<Jurado, Integer> notas2 = new HashMap<>();
        notas2.put(j5, 7); notas2.put(j6, 8); notas2.put(j7, 7); notas2.put(j8, 6);

        Banca banca1 = new Banca(projeto1, notas1);
        Banca banca2 = new Banca(projeto2, notas2);

        // Apresentações
        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, new Sala("Sala 1"), LocalDateTime.now());
        Apresentacao apresentacao2 = new Apresentacao(projeto2, banca2, new Sala("Sala 2"), LocalDateTime.now());
        Apresentacoes.getInstance().adicionar(apresentacao1);
        Apresentacoes.getInstance().adicionar(apresentacao2);

        // Calcula nota final de cada projeto
        apresentacao1.avaliar();
        apresentacao2.avaliar();

        // Lista projetos com nota final >= 7
        System.out.println("Projetos aprovados:");
        Apresentacoes.getInstance().getApresentacoes().stream()
            .map(Apresentacao::getProjeto)
            .filter(p -> p.getNotaFinal() >= 7)
            .forEach(p -> System.out.println(p.getNome() + " - Nota: " + p.getNotaFinal()));
    }
}
