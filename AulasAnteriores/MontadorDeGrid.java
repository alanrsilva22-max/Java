/*4. Construa uma classe MontadorDeGrid que permita ao usuário preencher um grid numérico de 3x3. 
O programa deve usar laços aninhados e Scanner para solicitar um número para cada célula da matriz. Após o preenchimento completo, exiba a matriz no
console, formatada como uma grade com colunas bem alinhadas.*/


import java.util.Scanner;

public class MontadorDeGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];  
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + matriz[i][j]+ "|" );
            }
            System.out.println();
        }

       
    }
}