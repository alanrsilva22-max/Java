package Buscador;

public class Buscador {
    public static int buscadorSequencial( int[] vetor, int busca){
        for(int i = 0; i < vetor.length; i++){
            if(vetor [i] == busca){
                return i;
            }
        }
        return -1;
    }
        public static int buscaBinaria(int[]vetor,int busca){
            int inicio = 0;
            int fim = vetor.length -1;
    
            while(inicio <= fim){ 
            int  meio = inicio + (fim - inicio)/2;
            System.out.printf("o %d é o inicio, o %d é o meio e o %d é o fim", inicio, meio, fim);
            
            if(vetor[meio] == busca){
                return meio;
            }
            if(vetor[meio] <  busca){
                inicio = meio -1;
            }else{
            fim = meio +1;
        }
      }
        return -1;
    }
}