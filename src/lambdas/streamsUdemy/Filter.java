package lambdas.streamsUdemy;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8, false);
        Aluno a2 = new Aluno("Bia", 5.8, true);
        Aluno a3 = new Aluno("Daniel", 9.8, true);
        Aluno a4 = new Aluno("Gui", 6.8, true);
        Aluno a5 = new Aluno("Rebeca", 7.1,true);
        Aluno a6 = new Aluno("Pedro", 8.8, false);
        Aluno a7 = new Aluno("Marcelo", 8.8, false);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4 ,a5, a6, a7);

        alunos.stream()
                .filter(a -> a.nota >= 7)
                .filter(a -> a.bomComportamento)
                .map(a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!")
                .forEach(System.out::println);

    }
}
