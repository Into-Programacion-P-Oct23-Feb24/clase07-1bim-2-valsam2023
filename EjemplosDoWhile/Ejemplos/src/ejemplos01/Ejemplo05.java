/*
En el ejemplo 05 lo que esta haciendo es declarar varias variables que despues 
se les otorgan un valor, tambien crean un contador con valor 1, luego resultado
es igual a resultado resultado por el valor de numero, y al contador se le asigna 
que sume 1, luego condiciona que mientras contador sea menor o igual a potencia,
se imprimira la operacion.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        // 2. numero, i[0, n]
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        numero = 4;
        // 8. potencia <-- 3
        potencia = 3;
        // 9. resultado <-- 1
        resultado = 1;

        int contador = 1;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
