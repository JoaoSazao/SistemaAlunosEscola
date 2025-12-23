package br.com.escola.app;

import br.com.escola.model.Aluno;
import br.com.escola.model.Escola;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola("Escola Técnica CEAP");

        Aluno aluno1 = new Aluno("Maria", "CP01", 19);
        Aluno aluno2 = new Aluno("João", "CP02", 20);
        Aluno aluno3 = new Aluno("Gustavo", "CP03", 23);

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);

        // CASO QUEIRA TESTAR EM CASOS DE NÃO TER NENHUM ALUNO À ESCOLA, BASTA COMENTAR A INSTÂNCIA ALUNOS

        escola.listarAlunos();
    }

}
