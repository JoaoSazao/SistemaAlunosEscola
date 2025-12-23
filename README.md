# 🏫 Sistema de Alunos e Escola em Java

Projeto desenvolvido em Java com foco em **Programação Orientada a Objetos (POO)**, simulando o gerenciamento de alunos em uma escola.

O sistema permite criar alunos, associá-los a uma escola e listar todos os alunos cadastrados via console.

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Classes e objetos
- Construtores
- Encapsulamento
- Relação entre classes (has-a)
- Coleções (`ArrayList`)
- Laço `for-each`
- Organização de pacotes
- Execução via console (CLI)

## 🏗️ Estrutura do projeto
src/ <br>
└── br/ <br>
└── com/ <br>
└── escola/ <br>
├── model/ <br>
│ ├── Aluno.java <br>
│ └── Escola.java <br>
└── app/ <br>
└── Main.java <br>

## 🎓 Classe Aluno

Representa um aluno da escola.

### Atributos:
- `nome` (String)
- `matricula` (String)
- `idade` (int)

### Métodos principais:
- `exibirDados()` → Exibe as informações do aluno no console

## 🏫 Classe Escola

Representa uma escola que contém vários alunos.

### Atributos:
- `nome` (String)
- `alunos` (ArrayList<Aluno>)

### Métodos principais:
- `adicionarAluno(Aluno aluno)` → Adiciona um aluno à escola
- `listarAlunos()` → Lista todos os alunos cadastrados

## ▶️ Como executar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/JoaoSazao/SistemaAlunosEscola.git
```
2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)
3. Execute a classe `Main.java`

🧪 Exemplo de saída no console
```markdown
Alunos da escola: Escola Técnica XPTO
----------------
Nome: Maria
Matrícula: A123
Idade: 19
----------------
Nome: João
Matrícula: B456
Idade: 22
----------------
```

#👨‍💻 Autor

Desenvolvido por João Victor
Estudante de Engenharia de Software
