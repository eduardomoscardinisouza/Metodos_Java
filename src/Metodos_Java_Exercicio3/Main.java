package Metodos_Java_Exercicio3;

public class Main {
    public static void main(String[] args){

        //Retornos
        System.out.println("Exercício Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado = " + areaQuadrado + " cm²");

        double areaRetangulo = Quadrilatero.area(3,4);
        System.out.println("Área do retângulo = " + areaRetangulo + " cm²");

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do Trapézio = " + areaTrapezio + " cm²");

    }
}
