public class VerificadorDePermissao {
    public static void main(String[] args) {
        double altura = 1.55;
        boolean acomanhado = true;
        if(altura >= 1.60 || acomanhado){
            System.out.println("Esta acompanhado pode entrar. ");
        }else{
        System.out.println("Nao esta acompanhado, nao pode entrar no brinquedo. ");
        }
    } 
}
/*2. Criar uma nova classe com o nome VerificadorDePermissao. Crie duas variáveis, 
altura (ex: 1.55) e estaAcompanhada (ex: true). Verifique e exiba no console se a 
pessoa pode entrar no brinquedo, sabendo que a regra é ter altura mínima de 1.60m OU estar acompanhada. */