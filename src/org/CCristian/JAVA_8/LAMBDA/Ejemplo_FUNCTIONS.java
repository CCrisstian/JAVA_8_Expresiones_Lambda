package org.CCristian.JAVA_8.LAMBDA;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejemplo_FUNCTIONS {
    public static void main(String[] args) {

        Function<String, String> function_1 = parametro -> "Hola que tal! " + parametro;
        /*Function<Recibe un parámetro, Devuelve un resultado>*/

        String resultado = function_1.apply("Cristian");
        System.out.println("resultado = " + resultado);

        Function<String, String> function_2 = String::toUpperCase;
                                            /*parametro -> parametro.toUpperCase();*/
        System.out.println("function_2 = " + function_2.apply("cristian"));

        BiFunction<String, String, String> function_3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        /*BiFunction<Argumento_1, Argumento_2, Resultado> = (arg1, arg2) -> */
        String resultado_2 = function_3.apply("cristian ","cristaldo");
        System.out.println("resultado_2 = " + resultado_2);

        BiFunction<String, String, Integer> function_4 = String::compareTo;
                                                        /*(a, b) -> a.compareTo(b);*/
        /*compareTo debe devolver un valor entero que indique cómo el objeto actual se relaciona con el
        objeto pasado como argumento según la tabla ASCII.*/
        /*a.compareTo(b) --> si (a < b) = "- negativo" */
        /*a.compareTo(b) --> si (a > b) = "+ positivo" */
        /*a.compareTo(b) --> si (a = b) = "0" */
        System.out.println("function_4 = " + function_4.apply("3","2"));

        BiFunction<String, String, String> function_5 = String::concat; /*(a, b) -> a.concat(b)*/
        System.out.println("function_5 = " + function_5.apply("Cristian ", "Cristaldo"));
    }
}
