package org.CCristian.JAVA_8.LAMBDA.ARITMETICA;

import java.util.function.BiFunction;

public class Calculadora{

/*------------------------MÉTODO------------------------*/
    public double computar (double a, double b, Aritmetica lambda){    /*expresión LAMBDA*/
        return lambda.operacion(a, b);
    }

    public double computar_con_BiFunction (double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a,b);
    }
/*------------------------MÉTODO------------------------*/

}
