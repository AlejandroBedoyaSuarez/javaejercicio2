/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        int dato1 = 4;
        int dato2 = 2;
        int dato3= dato1+dato2;
        System.out.println(dato3);
        System.out.println(dato1+dato2);

        int valor1 = 10;
        int valor2 = 3;
        int valor3= valor1-valor2;
        System.out.println(valor3);
        System.out.println(valor1-valor2);

        int multiplicacion1= 10;
        int multiplicacion2= 3;
        int resultadoMultiplicacion= multiplicacion1*multiplicacion2;
        System.out.println(resultadoMultiplicacion);
        System.out.println(multiplicacion1*multiplicacion2);

        int division1= 8;
        int division2= 4;
        double division3= 10;
        double division4= 3;
        double resultadoDivison2= division3/division4;
        int resultadoDivision= division1/division2;
        System.out.println(resultadoDivision);
        System.out.println(division1/division2);
        System.out.println(resultadoDivison2);
        System.out.println(division3/division4);
        //para decimales es mejor usar float debido a que no necesitamos mucho a menos que trabajemos con cantidades largas
        //Los lenguajes de programación no san tan exactos con solo operaciones sencillas
        float division5= 10f;
        float division6= 3f;
        float resultadoFloat= division5/division6;
        System.out.println(resultadoFloat);
        

        int modulo1= 10;
        int modulo2= 2;
        int modulo3= 3;
        int resultadoModulo= modulo1%modulo2;
        int resultadoModulo2= modulo1%modulo3;
        System.out.println(resultadoModulo);
        System.out.println(resultadoModulo2);
        System.out.println(modulo1 % modulo2);
        System.out.println(modulo1%modulo3);

        //En java para hacer el exponente se puede hacer de dos maneras
        /*
         * Primera forma: Aplicamos el Math.pow (base*exponente)
         * Segunda forma: Hacerlo del modo clásico= base*base, cubo= base*base*base, etc.
        */

        //El método Math.pow siempre retorna un double, incluso si la base y el exponente son enteros.
        int baseExponente= 4;
        int exponente= 2;
        double resultadoExponente= Math.pow(baseExponente, exponente);
        System.out.println(resultadoExponente);
        int resultadoExponente2= 4*4;
        System.out.println("El resultado de 4 al cuadrado es: " + resultadoExponente2);

        //a diferencia de JavaScript, aquí si mantenemos la division en int, nos dará ese
        //a pesar de ser un resultado decimal, esto nos devolverá solo la parte entera de la división
        int divisionEntera= 10/3;
        System.out.println(divisionEntera);

        boolean dataBase= 4==2;
        System.out.println(dataBase);
        boolean dataBase2= 4!=2;
        System.out.println(dataBase2);
        boolean dataBase3= 4<8;
        System.out.println(dataBase3);
        boolean database4= 4>9;
        System.out.println(database4);
        //Dato importante: El igual siempre debe estar a la derecha a menos que quieras ver los números superiores (se hace infinito y te petará la pc)
        boolean database5= 4<=4;
        System.out.println(database5);
        boolean database6= 120>=119;
        System.out.println(database6);

        System.out.println("Operadores Lógicos");
        int logica1= 10;
        int logica2= 4;
        int logica3= 20;
        int logica4= 10;
        //&& es AND
        System.out.println(logica1<logica3 && logica2<logica4);
        //dice logica1 NO es menor que logica2
        System.out.println(!(logica1<logica2));
        System.out.println(logica1<logica3 || logica1<logica2);

        System.out.println("Operadores de Asignación");

        int operadorIgual= 4;
        System.out.println(operadorIgual);
        int operadorSuma= 2;
        operadorSuma+= 1;
        operadorSuma+= 1;
        operadorSuma+= 1;
        operadorSuma+= 1;
        operadorSuma+= 1;
        System.out.println(operadorSuma);
        int operadorResta= 100;
        operadorResta-=10;
        operadorResta-=10;
        operadorResta-=10;
        operadorResta-=10;
        operadorResta-=10;
        System.out.println(operadorResta);
        int operadorMultiplicacion= 2;
        operadorMultiplicacion*=2;
        operadorMultiplicacion*=2;
        operadorMultiplicacion*=2;
        operadorMultiplicacion*=2;
        operadorMultiplicacion*=2;
        operadorMultiplicacion*=2;
        System.out.println(operadorMultiplicacion);
        int operadorDivision= 128;
        operadorDivision/= 2;
        operadorDivision/= 2;
        operadorDivision/= 2;
        operadorDivision/= 2;
        operadorDivision/= 2;
        System.out.println(operadorDivision);

    }

}
