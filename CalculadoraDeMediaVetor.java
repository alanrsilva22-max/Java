/*Exercício 2. 

Desenvolva uma classe CalculadoraDeMediaVetor para calcular a média de um aluno. 
Utilizando Scanner, o programa deve solicitar as 4 notas bimestrais, 
armazenando-as em um vetor de double. Após a inserção de todas as notas, calcule a média final
e exiba o resultado formatado com duas casas decimais. */




    import java.util.Scanner; // Importação da classe Scanner (necessária para ler dados do teclado)
    public class CalculadoraDeMediaVetor { // Declaração da classe principal chamada "CalculadoraDeMediaVetor"

     public static void main(String[] args) { // Método main: ponto de entrada da aplicação Java
         Scanner sc = new Scanner(System.in); // Criação do objeto "sc" da classe Scanner para capturar entradas do usuário

         String[] notas = new String[4]; // Declaração de um vetor de Strings com 4 posições para armazenar as notas digitadas
         double soma = 0; // Variável acumuladora "soma" inicializada em 0 (armazenará a soma das notas)
         double media; // Declaração da variável "media" (será usada para armazenar o resultado final)
            for (int i = 0; i < notas.length; i++) { // Estrutura de repetição for: percorre todas as posições do vetor "notas"
                System.out.print("Digite a nota " + (i + 1) + ": "); // Exibe mensagem pedindo a nota correspondente
                notas[i] = sc.nextLine(); // Lê a entrada do usuário e armazena no vetor "notas" na posição i
                soma += Double.parseDouble(notas[i]); // Converte a String digitada para double e adiciona ao acumulador "soma"
        } // Fim do laço for
        media = soma / notas.length; // Calcula a média dividindo a soma pelo total de notas
        System.out.println("A media das notas digitadas eh: " + media); // Exibe o resultado da média no console
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    } // Fim do método main
} // Fim da classe 

    

