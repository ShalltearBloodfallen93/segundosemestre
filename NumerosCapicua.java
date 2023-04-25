/*Nombre: Leonardo Daniel Martínez Rosas
Grupo: 201
Licenciatura: Ciencia de Datos para Negocios
Practica de numeros capicua.
*/
package ejerciciosdejavaescuela;


import java.util.Scanner;

public class NumerosCapicua {
    public static void main(String[] args) {
        
        //se crea un objeto de tipo scanner para pedir un numero al usuario.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Porfavor, ingrese un número entero positivo: ");
        
        //se usaran 3 variables
        int numero = entrada.nextInt();//guarda el numero dado por el usuario
        int numeroOriginal = numero;//guarda el valor de la var numero en la var numero original
        int numeroInvertido = 0;//se inicializa en cero
        
      
        while (numero > 0) {
            int residuo = numero % 10;//ejemplo si el usuario ingressa 255 se guardara 5,es decir el modulo
            numeroInvertido = numeroInvertido * 10 + residuo;
            numero = numero / 10;//divide la var numero entre 10 y la asigna a la misma var solo la parte entera
        }
        //se crea una condicion para comparar los valores de las variables
        if (numeroOriginal == numeroInvertido) {//si numorig es exactamente igual a numinv sera numero capicua
            System.out.println(numeroOriginal + " es un número capicúa.");
        } else {//cualquier otra cosa no sera numero capicua
            System.out.println(numeroOriginal + " no es un número capicúa.");
        }
    }
}
