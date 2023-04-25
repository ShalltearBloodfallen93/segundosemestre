/*Nombre: Leonardo Daniel Martínez Rosas
Grupo: 201
Licenciatura: Ciencia de Datos para Negocios
Practica de listas enlazadas.
*/

package ejerciciosdejavaescuela;

/* Esta clase encapsula un nombre y un número telefónico, el metodo NumerosTel al esta encapsulado
con el modificador de acceso public se puede acceder a el desde cualquier clase que este
en el mismo paquete.
*/
public class NumerosTel {//esta clase aloja dos variables; nombre y numero.

    String nombre;
    String numero;

    /*este constructor es un metodo especial que permite comunicar el valor de las variables
    al inicializar un objeto en otra clase mediante un metodo.
    */
    public NumerosTel(String nombre, String numero) {//tiene dos parametros en el cuerpo de constructor
        this.nombre = nombre;//con la palabra reservada this indicamos que valor se le dara a la var. nombre
        this.numero = numero;//con la palabra reservada this indicamos que valor se le dara a la var. numero.
    }
}
