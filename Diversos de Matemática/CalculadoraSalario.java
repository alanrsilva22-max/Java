public class CalculadoraSalario {
    public static void main(String[] args) {
     double salario = 6000;
     double salarioComDesconto;
     if(salario <= 1751.81){
        salarioComDesconto = salario - (salario * 8/100);
        System.out.println("Seu salario e : " + salario + " e depois do desconto do INSS fica: " + salarioComDesconto);
     }else if(salario <= 2919.73){
        salarioComDesconto = salario - (salario * 9/100);
        System.out.println("Seu salario e : " + salario + " e depois do desconto do INSS fica: " + salarioComDesconto);
     }else if(salario <= 5839.45){
        salarioComDesconto = salario - (salario * 10/100);
        System.out.println("Seu salario e : " + salario + " voce recebeu  do INSS fica: " + salarioComDesconto);
     }else{
        salarioComDesconto = salario - (salario * 11/100);
        System.out.println("Seu salario e : " + salario + " e depois do desconto do INSS fica: " + salarioComDesconto);
    }
    }
}
