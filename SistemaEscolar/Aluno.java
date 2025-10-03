package SistemaEscolar;

public class Aluno {
    //Atributos (os campos do nosso registro)
    String nome;
    int matricula;
    double notaFinal;
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        //Preenchimento dos dados do registro
        aluno1.nome = "Carlos Pereira";
        aluno1.matricula = 201;
        aluno1.notaFinal = 7.5;
        System.out.println("Matricula do aluno: " +aluno1.matricula + "\n" +aluno1.notaFinal+ "\n" +aluno1.nome );
    }
}
