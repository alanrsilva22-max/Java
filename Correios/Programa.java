package Correios;


public class Programa {
    public static void main(String[] args) {
        
       Endereco endDoJoao = new Endereco();
        endDoJoao.rua = "Rua da Flores";
        endDoJoao.numero = 123;
        endDoJoao.cep = "25680-000";
        endDoJoao.cidade = "Petropolis";
        
        Pessoa joao = new Pessoa();
        joao.nome = "Joao Silva";
        joao.cpf = "111.222.333-44";

        joao.endereco = endDoJoao;
       
        System.out.println("O " + joao.nome + " mora na cidade " + joao.endereco.cidade+ ", numero " + joao.endereco.numero);
    }
}
