package helloword_junit;

public class CalculadoraTeste {
    public static void main(String[] args) {

        // Exemplo de teste automaizado
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3,7);
        System.out.println(soma);

        soma = calc.somar(0,3);
        System.out.println(soma);

        soma = calc.somar(0,0);
        System.out.println(soma);

        soma = calc.somar(3,-1);
        System.out.println(soma);
    }
}
