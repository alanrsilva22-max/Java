package SistemaEscolar;

import java.util.Scanner;

public class SistemasEscolar {
    public static void main(String[] args) {
        Aluno3[] turma = new Aluno3[3];
        Scanner Leia = new Scanner(System.in);
        System.out.println("------Cadastro de Alunos-------\n");
        for(int i =0; i< turma.length; i++){
            turma[i] = new Alunos();
            
            System.out.printf("Digite o nome do %dº Alunos: ", i+1);
            turma[i].nome = Leia.nextLine();
            
            System.out.printf("Digite a matriculado %dº aluno: ", i+1);
            turma[i].matricula = Leia.nextInt();
        
            System.out.printf("Digite a nota do %dº Alunos: ", i+1 );
            turma[i].notaFinal = Leia.nextDouble();
            System.out.println("------------------------------\n");

            Leia.nextLine();
        }
        for(int i=0; i< turma.length; i++){
            System.out.printf(" Dados do %dº Alunos sao: \nnome %s \n matricula %d nota: %.2f\n ", i+1, turma[i].nome, turma[i].matricula, turma[i].notaFinal);
        }
        Leia.close();
    }
}
