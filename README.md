<h1 align="center">JAVA 8</h1>
<p>Java 8 es una versión importante del lenguaje de programación Java, lanzada por Oracle en marzo de 2014. Introdujo varias características y mejoras significativas en comparación con versiones anteriores. Algunas de las características clave de Java 8 incluyen:</p>

-  Expresiones Lambda:
    -  Las expresiones lambda permiten expresar instancias de interfaces funcionales (interfaces con un solo método abstracto) de una manera más concisa y legible.

-  Streams y Operaciones Funcionales:
    -  Los streams proporcionan una forma declarativa de realizar operaciones en colecciones de datos. Se introducen operaciones funcionales como "map", "filter", y "reduce" que facilitan la manipulación de datos.

-  Interfaz Funcional y Anotación '@FunctionalInterface':
    -  Se introdujo la anotación "@FunctionalInterface" para marcar interfaces funcionales y facilitar su diseño.

-  Nuevos Métodos en Interfaces:
    -  Se añadieron métodos por defecto ("default methods") en interfaces, permitiendo agregar nuevos métodos a interfaces existentes sin romper la compatibilidad con las implementaciones existentes.

-  Nueva API de Fecha y Hora:
    -  La API de fecha y hora ("java.time") reemplazó a la antigua "java.util.Date" y "java.util.Calendar", proporcionando una implementación más moderna y funcional.

-  Nashorn JavaScript Engine:
    -  Se introdujo el motor Nashorn para ejecutar código JavaScript en la JVM, ofreciendo una alternativa mejorada a Rhino.

-  Mejoras en Colecciones:
    -  Se añadieron nuevos métodos a las clases de la API de colecciones, como forEach, removeIf, y replace.

-  Mejoras en el Manejo de Null:
    -  La introducción de la clase Optional y métodos como orElse facilitaron el manejo de valores nulos de manera más segura.

-  Proyecto Jigsaw (JPMS):
    -  Aunque la implementación completa de Project Jigsaw se completó en Java 9, los primeros pasos hacia este proyecto modular se dieron en Java 8 con la introducción del concepto de módulos.

-  Mejoras en el Desempeño:
    -  Java 8 incluyó varias mejoras de rendimiento, como el uso de la interfaz de llamada dinámica (invocación dinámica de métodos), la mejora de los bucles for y la optimización del recolector de basura.
 
<p>Java 8 marcó un hito significativo en la evolución de Java al introducir características que mejoraron la expresividad del lenguaje y facilitaron la programación funcional.</p>    

<h2>Consumer </h2>
<p>"Consumer" es una interfaz funcional en Java que se encuentra en el paquete "java.util.function". Esta interfaz está diseñada para representar una operación que toma un argumento de entrada y no devuelve ningún resultado. En otras palabras, un "Consumer" representa una función que realiza una acción en un objeto, pero no produce ningún resultado.</p>
<p>La interfaz "Consumer" tiene un método abstracto llamado "accept(T t)", donde T es el tipo de dato del objeto que se está consumiendo. Este método "accept" es donde se define la acción que el Consumer realizará sobre el objeto de entrada.</p>
<p align="center"><img width="422" alt="image" src="https://github.com/CCrisstian/JAVA_8_LAMBDA/assets/111469216/4a8c0e88-93e6-4805-81ca-f7b27437fa38"></p>
<p>El uso de "Consumer" es común en situaciones donde se desea encapsular una acción que debe realizarse en cada elemento de una colección, o como parte de una cadena de operaciones en un stream. La interfaz funcional "Consumer" es parte de las funciones de alto orden en Java y es esencial para la programación funcional en el lenguaje.</p>

<h2 >BiConsumer</h2>
<p>"BiConsumer" es una interfaz funcional en Java que se encuentra en el paquete "java.util.function". Al igual que "Consumer", "BiConsumer" representa una operación que toma dos argumentos de entrada y no devuelve ningún resultado.</p>
<p>La interfaz "BiConsumer" tiene un método abstracto llamado "accept(T t, U u)", donde T y U son los tipos de datos de los dos argumentos que se están consumiendo.</p>
<p align="center"><img width="490" alt="image" src="https://github.com/CCrisstian/JAVA_8_LAMBDA/assets/111469216/49519673-8682-46a9-abf2-2779e36ea97b"></p>
<p>"BiConsumer" es útil en situaciones donde necesitas realizar operaciones que involucren dos argumentos, y su uso es común en combinación con colecciones y operaciones en pares de valores. La interfaz funcional "BiConsumer" es parte del conjunto de funciones de alto orden en Java y es esencial para la programación funcional.</p>

<h2>Supplier</h2>
<p>"Supplier" es una interfaz funcional en Java que se encuentra en el paquete "java.util.function". Representa un proveedor de resultados, es decir, una operación que no toma argumentos y produce un resultado. La interfaz "Supplier" no tiene ningún método que acepte argumentos, pero tiene un único método abstracto llamado "get()", que devuelve un resultado.</p>
<p align="center"><img width="438" alt="image" src="https://github.com/CCrisstian/JAVA_8_LAMBDA/assets/111469216/5ff71fc4-403c-49af-962f-6f95f7f2c66c"></p>
<p>"Supplier" es una herramienta flexible y versátil que se utiliza en situaciones donde necesitas generar o proporcionar valores sin la necesidad de recibir argumentos. Puedes utilizarlo en diversas situaciones, desde la generación de valores aleatorios hasta la creación de instancias de objetos más complejos. La interfaz funcional "Supplier" es parte del conjunto de funciones de alto orden en Java y es esencial para la programación funcional.</p>

<h2>Function</h2>
<p>"Function" es una interfaz funcional en Java que se encuentra en el paquete "java.util.function". Representa una función que toma un argumento de tipo T y devuelve un resultado de tipo R. La interfaz "Function" tiene un método abstracto llamado "apply(T t)", que toma un argumento de tipo T y devuelve un resultado de tipo R.</p>
<p align="center"><img width="488" alt="image" src="https://github.com/CCrisstian/JAVA_8_LAMBDA/assets/111469216/70d2799d-9724-4363-9052-06b143a96fe9"></p>

-    T: Tipo del argumento de entrada.
-    R: Tipo del resultado.

<p>Function es una herramienta versátil que se utiliza para representar funciones en programación funcional y se integra bien con el manejo de colecciones utilizando streams. Puede ser utilizada en una variedad de situaciones donde se necesita transformar un tipo de dato en otro.</p>

<h2>BiFunction</h2>
<p>"BiFunction" es una interfaz funcional en Java que se encuentra en el paquete "java.util.function". Esta interfaz representa una función que toma dos argumentos de entrada de tipos T y U, realiza un cálculo y devuelve un resultado de tipo R. Es similar a la interfaz "Function", pero toma dos argumentos en lugar de uno.</p>
<p align="center"><img width="488" alt="image" src="https://github.com/CCrisstian/JAVA_8_LAMBDA/assets/111469216/053c1ec0-cfea-44de-9e82-11391cc8c3be"></p>

-    T: Tipo del primer argumento.
-    U: Tipo del segundo argumento.
-    R: Tipo del resultado.

<p>"BiFunction" es útil en situaciones donde se necesita una función que tome dos argumentos y produzca un resultado, y se utiliza en programación funcional y en el manejo de colecciones utilizando streams.</p>

<h2>Predicate</h2>
<p>En Java, la interfaz funcional "Predicate" se encuentra en el paquete "java.util.function" y se utiliza para representar una condición o predicado que puede ser evaluado como verdadero o falso. Esta interfaz tiene un único método abstracto llamado "test", que toma un argumento de tipo T y devuelve un valor booleano.</p>
<p align="center"><img width="488" alt="image" src="https://github.com/CCrisstian/JAVA_8_LAMBDA/assets/111469216/9ea6fcee-0bba-4997-9fc5-2fd840e3511c"></p>

-    T: Tipo del argumento que se evaluará.

<p>Predicate es una herramienta útil para escribir expresiones condicionales más legibles y concisas en Java, especialmente cuando se trabaja con colecciones y operaciones de filtrado</p>

<h2>BiPredicate</h2>
<p>"BiPredicate" es una interfaz funcional en Java que se encuentra en el paquete "java.util.function". Al igual que "Predicate", "BiPredicate" se utiliza para representar una condición o predicado que puede ser evaluado como verdadero o falso. La diferencia principal es que "BiPredicate" toma dos argumentos de entrada (T y U) en lugar de uno. Esta interfaz tiene un único método abstracto llamado "test", que toma dos argumentos y devuelve un valor booleano.</p>
<p align="center"><img width="488" alt="image" src="https://github.com/CCrisstian/JAVA_8_LAMBDA/assets/111469216/20af8293-a286-4c82-a6e0-9a9c455f94ba"></p>

-    T: Tipo del primer argumento.
-    U: Tipo del segundo argumento.

<p>"BiPredicate" es útil en situaciones donde se necesita evaluar condiciones que involucren dos argumentos y devolver un valor booleano. Se puede utilizar para expresar lógica condicional de manera más clara y concisa en el código.</p>
