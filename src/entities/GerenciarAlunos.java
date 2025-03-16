package entities;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {

    Set<Aluno> alunosSet;

    public GerenciarAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(int matricula) {
        if (alunosSet.isEmpty()) {
            throw new IllegalStateException("A coleção está vazia");
        }
        Set<Aluno> alunosParaRemover = new HashSet<>();
        for (Aluno n : alunosSet) {
            if (n.getMatricula() == matricula) {
                alunosParaRemover.add(n);
            }
        }
        alunosSet.removeAll(alunosParaRemover);

    }

    public void exibirAlunoPorNome() {
        if (alunosSet.isEmpty()) {
            throw new IllegalStateException("Não podemos exibir alunos pelo nome, pois a coleção está vazia");
        }
        Set<Aluno> nomeAluno = new TreeSet<>(alunosSet);
        for (Aluno a : nomeAluno) {
            System.out.println("Aluno: " + a.getNome());
        }
    }

    public void exibirAlunoPorNota() {
        if (alunosSet.isEmpty()) {
            throw new IllegalStateException("Não podemos exibir alunos por nota, pois a coleção está vazia");
        }
        Set<Aluno> alunoNota = new TreeSet<>(new ComparatorNota());
        alunoNota.addAll(alunosSet);
        for (Aluno a : alunoNota) {
            System.out.println("Nome: " + a.getNome() + ", Nota: " + String.format("%.1f", a.getNote()));
        }

    }

    public void exibirAlunos() {
        if (alunosSet.isEmpty()) {
            throw new IllegalStateException("Não há nenhum aluno na coleção");
        }
        System.out.println(alunosSet);
    }


}
