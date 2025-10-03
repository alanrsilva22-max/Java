/*Exercício 2. 

Desenvolva uma classe CalculadoraDeMediaVetor para calcular a média de um aluno. 
Utilizando Scanner, o programa deve solicitar as 4 notas bimestrais, 
armazenando-as em um vetor de double. Após a inserção de todas as notas, calcule a média final
e exiba o resultado formatado com duas casas decimais. */




    import java.util.Scanner; 
    public class CalculadoraDeMediaVetor { 

     public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in); 
         String[] notas = new String[4]; 
         double soma = 0; 
         double media; 
            for (int i = 0; i < notas.length; i++) { 
                System.out.print("Digite a nota " + (i + 1) + ": "); 
                notas[i] = sc.nextLine(); 
                soma += Double.parseDouble(notas[i]); 
        } 
        media = soma / notas.length; 
        System.out.println("A media das notas digitadas eh: " + media); 
        sc.close(); 
    } 
} 

    

