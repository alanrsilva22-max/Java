import java.util.Scanner; // Importa a classe Scanner, que permite ler dados digitados pelo usuário

public class ListaDeCompras { // Declaração da classe principal chamada ListaDeItens
    public static void main(String[] args) { // Método main: ponto de entrada do programa
        
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner chamado "sc" para capturar entradas do teclado
        String[] itens = new String[5];      // Cria um vetor de Strings com 5 posições (armazenará 5 itens)

        // Um único laço for para percorrer o vetor
        for (int i = 0; i < itens.length; i++) { /*Laço que vai de i=0 até i < tamanho do vetor (5 vezes);incremento de 1 i++ */
            
            System.out.print("Digite o item " + (i + 1) + ": ");
            // Exibe uma mensagem pedindo ao usuário que digite o item correspondente à posição atual
            
            itens[i] = sc.nextLine();
            // Lê a linha digitada pelo usuário e armazena no vetor na posição i
            
            System.out.println("Item " + (i + 1) + " armazenado: " + itens[i]);
            // Mostra imediatamente o item que acabou de ser digitado e armazenado nesse execicoio eh opcional1
        }

        sc.close(); // Fecha o objeto Scanner para liberar os recursos do sistema
    }
}