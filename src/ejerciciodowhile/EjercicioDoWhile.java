/* Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break. */
package ejerciciodowhile;

import java.util.Scanner;

public class EjercicioDoWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int orden = 1;
        int suma = 0;
        do {
            System.out.println("Ingrese el número " + orden + "º a sumar");
            numero = leer.nextInt();
            if (numero == 0) {
                System.out.println("Ha ingresado el valor 0");
                break;
            }
            if (numero > 0) {
                suma = suma + numero;
            }
            orden++;
        } while (orden <= 20);

        System.out.println("La suma total es " + suma);
    }

}
           
    
    
