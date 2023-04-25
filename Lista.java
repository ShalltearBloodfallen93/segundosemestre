/*Nombre: Leonardo Daniel Martínez Rosas
Grupo: 201
Licenciatura: Ciencia de Datos para Negocios
Practica de listas enlazadas.
*/




package ejerciciosdejavaescuela;

/* Usa un Iterador para recorrer en bucle una colección en dirección hacia delante.
Usa un ListIterator para recorrer en bucle una colección
en dirección inversa
*/

import java.time.DayOfWeek;
import java.util.*;


// Demuestra Iterator y ListIterator.
public class Lista {
    public static void main(String args[]) {
        
        LinkedList <NumerosTel> agenda = new LinkedList  <NumerosTel>();//crea un obj de tipo LinkedList
        
        /*al crear el objeto agenda podemos agregar un nombre y un numero de tel mediante
        el metodo .add y asignarle el valor a las variables que se encuantran en la clase 
        NumerosTel gracias al constructor(metodo) previamente creado. que guarda nuestras variables
        nombre y numero.
        */
        agenda.add(new NumerosTel("Leonardo", "55-50415522"));
        agenda.add(new NumerosTel("Daniel", "55-89784512"));
        agenda.add(new NumerosTel("Alberto", "55-23568941"));
        agenda.add(new NumerosTel("Juanita", "55-12213256"));
        agenda.add(new NumerosTel("Dedotes","55-45788965"));
        agenda.add(new NumerosTel("Juancho", "55-41258596"));
        

        // Usa un Iterador para mostrar la lista.
        Iterator<NumerosTel> recorrido = agenda.iterator();//se crea un obj de tipo iterator.
        NumerosTel et;
        System.out.println("Itera o muestra la lista en " + "direcci\u00a2n normal:");
        while (recorrido.hasNext()) {
            et = recorrido.next();
            System.out.println(et.nombre + ": " + et.numero);
        }
        System.out.println();// este print separa para que se vea amontonado.

        // Usa un ListIterator para mostrar la lista en orden inverso.
        ListIterator<NumerosTel> litr
                = agenda.listIterator(agenda.size());
        System.out.println("Itera o muestra la lista en "+ "direcci\u00a2n inversa:");
        while (litr.hasPrevious()) {
            et = litr.previous();
            System.out.println(et.nombre + ": " + et.numero);
        }
    }
}
