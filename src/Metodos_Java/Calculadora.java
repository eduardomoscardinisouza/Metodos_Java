package Metodos_Java;

public class Calculadora {

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " e " + numero2 + " é igual a " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println ("A multiplicacao de " + numero1 + " e " + numero2 + " é igual a " + resultado);
    }

    public static void divisão(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println ("A divisao de " + numero1 + " e " + numero2 + " é igual a " + resultado);
    }

}
