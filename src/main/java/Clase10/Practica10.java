/*

Dado un arreglo A de N elementos se desea crear otro arreglo, tal que cada uno
de sus elementos sea la suma de los elementos opuestos en eñ arreglo dado.

Ejemplo: Arreglo dado A = [9,5,3,10,2,8,1]
         Arreglo resultante B = [10,13,5,10]

*/
package Clase10;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class Practica10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int nuevo;
        int resto, seguir = 0;
        
        do {
            System.out.print("Ingrese tamaño del arreglo: ");
            n = sc.nextInt();

            if (n % 2 == 0) {

                nuevo = n / 2;
                resto = 0;

            } else {

                nuevo = (n / 2) + 1;
                resto = 1;

            }

            int[] numeros = new int[n];
            int[] suma = new int[n];

            System.out.println("Tecle los " + n + " Valores: ");

            for (int i = 0; i < n; i++) {

                System.out.print((i + 1) + " : ");
                numeros[i] = sc.nextInt();

            }

            System.out.println("LOS ELEMENTOS DEL ARREGLO SON: ");

            for (int j = 0; j < numeros.length; j++) {

                System.out.println(numeros[j] + " ");

            }

            System.out.println("");

            System.out.println("LOS ELEMTOS DEL NUEVO ARREGLOS SON: ");

            for (int i = 0; i < nuevo; i++) {

                if (numeros[i] > 0) {
                    if (i + 1 == nuevo) {
                        if (resto == 0) {

                            suma[i] = numeros[i] + numeros[n - i - 1];
                            System.out.println(suma[i] + " ");
                        } else {

                            suma[i] = numeros[i] + 0;
                            System.out.println(suma[i] + " ");

                        }
                    } else {
                        suma[i] = numeros[i] + numeros[n - i - 1];
                        System.out.println(suma[i] + " ");
                    }
                }
            }
            System.out.println("Si quiere continuar preione: 1 , si desea salir presione: caulquier digito");
            seguir = sc.nextInt();
        } while (seguir == 1);
    }
}
