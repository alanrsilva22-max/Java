/* 3. Crie uma classe MaiorNumero que analise um conjunto de pontuações. 
Peça ao usuário para inserir 6 números inteiros, que podem representar
pontuações de um jogo, usando Scanner ou JOptionPane. Armazene esses 
números em um vetor, processe os dados para encontrar a maior pontuação 
e, ao final, exiba o recorde encontrado. */


import javax.swing.JOptionPane; // Importa a classe JOptionPane para criar janelas de entrada e saída

public class MaiorNumero { // Declaração da classe principal

    public static void main(String[] args) { // Método main: ponto de entrada do programa

        int[] pontos = new int[6]; // Vetor de inteiros com 6 posições para armazenar as pontuações
        int maior = Integer.MIN_VALUE; // Variável para guardar o maior valor (inicializada com o menor inteiro possível)

        // Laço para pedir 6 valores ao usuário
        for (int i = 0; i < pontos.length; i++) {
            // Abre uma janela pedindo a pontuação
            String entrada = JOptionPane.showInputDialog("Digite a pontuação " + (i + 1) + ":");
            
            // Converte a entrada (String) para inteiro
            pontos[i] = Integer.parseInt(entrada);

            // Verifica se a pontuação atual é maior que a armazenada em "maior"
            if (pontos[i] > maior) {
                maior = pontos[i]; // Atualiza o maior valor
            }
        }

        // Monta uma string com todas as pontuações digitadas
        String lista = "";
        for (int p : pontos) {
            lista += p + " ";
        }

        // Exibe em uma janela a lista de pontos e o recorde encontrado
        JOptionPane.showMessageDialog(
            null,
            "Pontuações digitadas: " + lista + "\nRecorde (maior pontuação): " + maior
        );
    }
}