/*2. Crie uma classe SomadorDeImpares. Use um laço for para iterar de 1 a 100. 
Use uma condição if para verificar se o número atual é ímpar e adicione-o 
a uma variável soma. Imprima o valor final da soma.*/

public class SomadorDeImpares {

    public static void main(String[] args) {

        int soma = 0;
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 != 0) {
                soma+=numero;
                
            }
        }
        System.out.println("A soma de todos os números ímpares de 1 a 100 é: " + soma);
    }    
}        
        
        
        
        
        
        