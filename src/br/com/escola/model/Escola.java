package br.com.escola.model;
import java.util.ArrayList;

public class Escola {
    private String nome;
    private ArrayList<Aluno> alunos;

    public Escola(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void listarAlunos() {

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno encontrado!");
        } else {
            System.out.println("Alunos da escola: " + nome);

            for (Aluno aluno : alunos) {
                aluno.exibirDados();
                System.out.println("---------------------");
            }
        }


    }

}
