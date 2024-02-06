package org.CCristian.JAVA_8.LAMBDA;

import org.CCristian.JAVA_8.LAMBDA.MODELS.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Ejemplo_CONSUMER {
    public static void main(String[] args) {

        Consumer<String> consumidor_saludo = saludo -> {
        /*Consumer<Tipo de Dato> = argumento -> Acción a realizar*/
            System.out.println("\tConsumer<String> consumidor_saludo");
            System.out.println(saludo + "\n");
        };

        Consumer<Date> consumidor_fecha = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("\tConsumer<Date> consumidor_fecha");
            System.out.println(f.format(fecha)+ "\n");
        };

        consumidor_saludo.accept("Hola, buenos días");
        consumidor_fecha.accept(new Date());

        BiConsumer<String, Integer> consumidorBiConsumer = (nombre,edad) -> {
        /*BiConsumer<Tipo de Dato1, Tipo de Dato2> = (argumento1, argumento2) -> Acción a realizar*/
            System.out.println("\tBiConsumer<String, Integer> consumidorBiConsumer");
            System.out.println(nombre + " tiene " + edad + " años\n");
        };

        consumidorBiConsumer.accept("Cristian",30);

        Consumer<String> consumidor_ImprimirMensaje = System.out::println;
        /*Consumer<Tipo de Dato> =  Acción a realizar*/
        consumidor_ImprimirMensaje.accept("Hola mundo LAMBDA (⌐■_■)");

        List<String> nombres = Arrays.asList("andres","pepe","luz","paco");
        nombres.forEach(consumidor_ImprimirMensaje);

        Usuario usuario = new Usuario();
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario,"Cristian");
        /*asignarNombre.accept(Instancia de la Clase, argumento);*/
        System.out.println("\n\tBiConsumer<Usuario, String> asignarNombre");
        System.out.println("usuario.getNombre() = " + usuario.getNombre() + "\n");

        Supplier<String> proveedor = () -> "Hola mundo LAMBDA Supplier (ﾉ◕ヮ◕)ﾉ";
        /*Supplier<Tipo de Valor que regresará> = Acción que se realiza y devuelve un valor*/

        System.out.println("\tSupplier<String> proveedor");
        System.out.println("proveedor.get() --> "+proveedor.get());


/*--------------COMBINANDO "Supplier" y "BiConsumer"--------------*/
        Supplier<Usuario> crearUsuario = Usuario::new;  /*Forma simplificada*/
        /*Supplier<Usuario> crearUsuario = () -> new Usuario();*/

        Usuario usuario2 = crearUsuario.get();

        /*BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;*/
        asignarNombre.accept(usuario2,"Cristian Alejandro");

        System.out.println("\n\tCOMBINANDO \"Supplier\" y \"BiConsumer\"");
        System.out.println("usuario.getNombre() = " + usuario.getNombre() + "\n");
/*--------------COMBINANDO "Supplier" y "BiConsumer"--------------*/
    }
}
