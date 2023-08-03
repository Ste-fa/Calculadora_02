package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Inserte el primer número: ");
        float num1 = teclado.nextFloat();

        System.out.print("Inserte el segundo número: ");
        float num2 = teclado.nextFloat();

        CalculadoraEnJava calculadora = new CalculadoraEnJava(num1, num2);
        calculadora.showMenu(teclado);
        teclado.close();
    }
}

class CalculadoraEnJava {
    float num1;
    float num2;
    float suma;
    float resta;
    float multiplicacion;

    float division;


    // Constructor para inicializar num1 y num2
    public CalculadoraEnJava(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void showMenu(Scanner teclado) {
        char opcion;

        do {
            System.out.println("A. Sumar");
            System.out.println("B. Restar");
            System.out.println("C. Multiplicar");
            System.out.println("D. Dividir");
            System.out.println("E. Salir");
            System.out.print("Elige una opción: ");
            opcion = Character.toUpperCase(teclado.next().charAt(0));
            System.out.println();

            switch (opcion) {
                case 'A':
                    suma();
                    System.out.println("El resultado de la suma es: " + suma);
                    System.out.println();
                    break;

                case 'B':
                    resta();
                    System.out.println("El resultado de la resta es: " + resta);
                    System.out.println();
                    break;

                case 'C':
                    multiplicacion();
                    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                    System.out.println();
                    break;

                case 'D':
                    if (num2 != 0) {
                        division();
                        System.out.println("El resultado de la división es: " + division);
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("¡Gracias por usar nuestros servicios!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, elige otra opción.");
                    System.out.println();
                    break;
            }
        } while (opcion != 'E');
    }

    float suma() {
        suma = num1 + num2;
        return suma;
    }

    float resta() {
        resta = num1 - num2;
        return resta;
    }

    float multiplicacion() {
        multiplicacion = num1 * num2;
        return multiplicacion;
    }

    float division() {
        division = num1 / num2;
        return division;
    }
}