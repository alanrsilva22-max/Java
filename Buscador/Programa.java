package Buscador;



public class Programa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7};
        int busca = 2;

        int posicao = Buscador.buscaBinaria(vetor, busca);
        if(posicao == -1){
            System.out.println("O numero mão esta na lista. ");
        }else{
            System.out.println();
            System.out.printf("O item buscado esta na posicao:  %d e é o item: %d\n\n", posicao, vetor[posicao]);
        }
    }
    
}
