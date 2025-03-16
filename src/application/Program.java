package application;

import entities.GerenciarAlunos;

public class Program {
    public static void main(String[] args) {
        GerenciarAlunos alunos = new GerenciarAlunos();

        try {

            alunos.adicionarAluno("Diana", 789789, 10);
            alunos.adicionarAluno("Fabio", 456156, 9);
            alunos.adicionarAluno("Alex", 987654, 3);
            alunos.adicionarAluno("Bob", 321123, 5);
            alunos.adicionarAluno("Maria", 654456, 4.5);
            alunos.adicionarAluno("Ana", 123987, 6.8);
            alunos.exibirAlunoPorNome();
            System.out.println("__________________________");
            alunos.exibirAlunoPorNota();
            alunos.removerAluno(987654);
            System.out.println("__________________________");
            alunos.exibirAlunos();
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
