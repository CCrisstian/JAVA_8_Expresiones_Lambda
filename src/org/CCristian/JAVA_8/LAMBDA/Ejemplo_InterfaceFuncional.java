package org.CCristian.JAVA_8.LAMBDA;

import org.CCristian.JAVA_8.LAMBDA.ARITMETICA.Aritmetica;
import org.CCristian.JAVA_8.LAMBDA.ARITMETICA.Calculadora;

public class Ejemplo_InterfaceFuncional {
    public static void main(String[] args) {

/*-----------------EXPRESIONES LAMBDA PERSONALIZADAS-----------------*/
        Aritmetica suma = Double::sum;  /*(a, b) -> a + b;*/
        Aritmetica resta = (a, b) -> a - b;
/*-----------------EXPRESIONES LAMBDA PERSONALIZADAS-----------------*/

        Calculadora calculadora = new Calculadora();

        System.out.println("\tcalculadora.computar (double a, double b, Aritmetica lambda)");

        System.out.println("calculadora.computar (10, 5, suma) = " + calculadora.computar(10, 5, suma));
        System.out.println("calculadora.computar (10, 5, resta) = " + calculadora.computar(10, 5, resta));
        System.out.println("\tcalculadora.computar(10, 5, (a, b) -> a * b)");
        System.out.println(calculadora.computar(10, 5, (a, b) -> a * b));

        System.out.println("\tcomputar_con_BiFunction (double a, double b, BiFunction<Double, Double, Double> lambda)");
        System.out.println(calculadora.computar_con_BiFunction(10,5,(a, b) -> a + b));
    }
}
