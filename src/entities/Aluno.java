package entities;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int matricula;
    private double note;

    public Aluno(String nome, int matricula, double note) {
        this.nome = nome;
        this.matricula = matricula;
        this.note = note;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome: '" + nome + '\'' +
                ", Matrícula: " + matricula +
                ", Nota: " + note +
                '}';
    }

    @Override
    public int compareTo(Aluno other) {
        return nome.compareTo(other.getNome());
    }
}

class ComparatorNota implements Comparator<Aluno> {


    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNote(), o2.getNote());
    }
}

