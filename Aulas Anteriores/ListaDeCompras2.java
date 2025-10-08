/*Exercício 01.

Crie uma classe chamada ListaDeCompras que funcione como um assistente pessoal. 
O programa deve solicitar ao usuário, via Scanner, que digite 5 itens de supermercado. 
Armazene cada item em um vetor de String e, ao final, exiba a lista completa de
forma organizada no console.*/



import java.util.Scanner; // Importação: importa a classe Scanner da biblioteca Java para capturar entradas do teclado

public class ListaDeCompras2 { // Classe: declaração da classe pública chamada ListaDeItens
    public static void main(String[] args) { // Método: método main, ponto de entrada do programa em Java
        
        Scanner sc = new Scanner(System.in); // Variável/Objeto: cria um objeto Scanner chamado "sc" para ler dados digitados pelo usuário
        String[] itens = new String[5];      // Array: cria um vetor de Strings com 5 posições para armazenar os itens
        String listaFinal = "";              // Variável: cria uma String vazia que servirá para acumular todos os itens digitados

        // Laço de repetição for
        for (int i = 0; i < itens.length; i++) { // Laço for: percorre o vetor do índice 0 até o último (usando itens.length = 5)
            
            System.out.print("Digite o item " + (i + 1) + ": ");  
            // Comando de saída: exibe uma mensagem pedindo ao usuário que digite o item correspondente à posição atual
            
            itens[i] = sc.nextLine(); 
            // Entrada de dados: lê a linha digitada pelo usuário e armazena no vetor (array) na posição i
            
            listaFinal += "Item " + (i + 1) + ": " + itens[i] + "\n";  
            // Operação com variável String: concatena o item digitado à variável listaFinal, adicionando uma quebra de linha
            // Isso acumula todos os itens em uma única String, mas ainda não exibe nada na tela
        }

        // Saída de dados
        System.out.println("\nLista de compras:"); 
        // Comando de saída: imprime um título antes de mostrar os itens
        
        System.out.println(listaFinal); 
        // Comando de saída: exibe todos os itens acumulados na variável listaFinal de uma vez só

        sc.close(); // Método: fecha o objeto Scanner para liberar os recursos do sistema
    }
}