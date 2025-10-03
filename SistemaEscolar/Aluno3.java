package SistemaEscolar;

public class Aluno3 {
    String nome;
    int matricula;
    double notaFinal;
    void verificarAprovacao(){
        if(notaFinal >= 7.0){
            System.out.println(nome + " esta APROVADO(A)! ");
        } else {
            System.out.println(nome + " esta REPROVADO(A)! ");
        }
    }
}
