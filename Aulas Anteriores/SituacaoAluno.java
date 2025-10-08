public class SituacaoAluno {
    public static void main(String[] args) {
        double nota1 = 10, nota2 = 10, media = (nota1+nota2)/2;
        if(media == 10){
            System.out.println("Sua media e " + media + " Aprovado Parabens ");
        }else if(media >= 7){
            System.out.println("Sua media e " + media + " Aprovado  ");
        }else{
            System.out.println("Sua media e " + media + " Reprovado ");
        }
    }
}
