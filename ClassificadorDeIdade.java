public class ClassificadorDeIdade {
    public static void main(String[] args) {
        int idade = 61;
        if(idade <= 12){
            System.out.println(" Criança ");
        }else if (idade <= 17){
            System.out.println(" Adolecente ");
        }else if (idade <=60){
            System.out.println(" Adulto ");
        }else if (idade >= 61){
            System.out.println(" Idoso ");
            
        }
    }
    
}

