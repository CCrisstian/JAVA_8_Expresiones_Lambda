package org.CCristian.JAVA_8.LAMBDA;

import org.CCristian.JAVA_8.LAMBDA.MODELS.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Ejemplo_PREDICATE {
    public static void main(String[] args) {

        Predicate<Integer> test_1 = numero -> numero > 10;
        /*Predicate<Argumento> -> boolean*/
        boolean resultado_1 = test_1.test(7);
        System.out.println("resultado_1 = " + resultado_1);

        Predicate<String> test_2 = role -> role.equals("ROLE_ADMIN");
        /*equalsIgnoreCase para que no tenga en cuenta si mayúscula o minúscula*/
        System.out.println("test_2 --> " + test_2.test("ROLE_ADMIN"));

        BiPredicate<String, String> test_3 = String::equals;    /*(a, b) -> a.equals(b);*/
        /*BiPredicate<Argumento_1, Argumento_2> -> boolean*/
        System.out.println("test_3 --> " + test_3.test("andres","andres"));

        BiPredicate<Integer, Integer> test_4 = (i, j) -> j > i;
        System.out.println("test_4 --> " + test_4.test(5,10));

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("maria");
        b.setNombre("cata");
        BiPredicate<Usuario, Usuario> test_5 = (us_a, us_b) -> us_a.getNombre().equals(us_b.getNombre());
        System.out.println("test_5 --> " + test_5.test(a,b));
    }
}
