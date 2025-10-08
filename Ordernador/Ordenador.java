package Ordernador;

public class Ordenador {
    public static void bubbleSort(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n -1; i++){
            System.out.printf("posicao i : %d\n", i);
            for(int j = 0; j < n -1 -i; j++){
                System.out.printf("item na posicao %d e %d e item na posicao %d e %d\n", j, vetor[j], j +1, vetor[j +1]);
                if(vetor[j] > vetor[j +1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j +1];
                    vetor[j +1] = temp;
                    System.out.printf("-----trocou----- \n item na posicao %d e %d e item na posicao %d e %d\n", j, vetor[j], j +1, vetor[j +1]);
                }
            }
        }
    }
}
    

