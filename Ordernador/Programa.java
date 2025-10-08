package Ordernador;

public class Programa {
    public static void main(String[] args) {
        int[] vetror = {30,18,55,77,2,5};
        Ordenador.bubbleSort(vetror);
        for(int i = 0; i < vetror.length; i++){
            System.out.printf("%d - %d\n", i, vetror[i]);
        }
    }
}
    

