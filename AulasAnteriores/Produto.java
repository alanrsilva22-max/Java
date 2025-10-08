//Exercício
/* Crie uma nova classe chamada Produto.
 * Adicione a ela os seguintes atributos: String nome, int codigo, double preco
 */


import java.util.Scanner;
public class Produto {
    String nome;
    int codigo;
    double preço;
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("qual o nome de seu produto");
        produto.nome = leia.nextLine();
        System.out.println("qual o codigo de seu produto");
        produto.codigo = leia.nextInt();
        System.out.println("qual o valor do produto");
        produto.preço = leia.nextDouble();
        System.out.println("seu produto \n"+"nome :"+produto.nome+"\n"+"codigo: " +produto.codigo+"\n"+"preço: "+produto.preço);
    
    }
}