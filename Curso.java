class Curso {
  String nome;
  float media;
  float notaFinal;

  Disciplina disciplina1 = new Disciplina();
  discpl.nome = "Matematica";
  Disciplina disciplina2 = new Disciplina();
  discpl.nome = "Calculo";
  Disciplina disciplina3 = new Disciplina();
  discpl.nome = "Fisica";
  
  float calcularMedia(float notaFinal, float media) {
    media = notaFinal / 3;
    return media;
  }

  boolean estaAprovado(float media) {
      if media >= 60{
        System.out.println("Aprovado");
      else{
        System.out.println("Reprovado");
      }
    }
  }
  
  float notaPorDiciplina() {
    return notaFinal;
  }
}