class Aluno {
  String nome;
  int matricula;
  Curso curso;
  Disciplina disciplina;
  Professor professor;

  //Constructor do Aluno
  Aluno(String n, int mat, Curso ncurso, Disciplina discpl, Professor prof){
    nome = n;
    matricula = mat;
    curso = ncurso;
    disciplina = discpl;
    professor = prof;
  }  
  
  void exibirRelatorio(String nome, Curso curso, boolean estaAprovado) {
    String n = "Nome do Aluno" + nome;
    Curso ncurso;
    boolean estaAprovado;
  }
}