/*Nombre: Leonardo Daniel Martínez Rosas
Grupo: 201
Licenciatura: Ciencia de Datos para Negocios
Practica de conjuntos.
*/

package ejerciciosdejavaescuela;

import java.util.HashSet;
import java.util.Set;

/*
 * @author ShalltearBloodfallen
 */

public class Conjuntos2 {//inicio de bloque de la clase Conjuntos2
    public static void main(String[] args) {//inicio bloque del metodo main
        
        System.out.println("---------------------");
        System.out.println("PRACTICA DE CONJUNTOS");
        System.out.println("---------------------");

        //se crean dos objetos de tipo Set para guardar ahi los datos de cada conjunto (b y c).
        Set<Integer> conjuntob = new HashSet<>();
        Set<Integer> conjuntoc = new HashSet<>();
        
   
        /*Se crean dos objetos de tipo Set, uno que guarda la interseccion y otro la union.
        para posteriormente operar B+C = (B u C)- (B n C); y asi eliminar los numeros repetidos.
        */
        Set<Integer> union = new HashSet<>();//aqui se guardara la union
        Set<Integer> interseccion = new HashSet<>(); //aqui se guardara la interseccion
        
      
        //PARA LA UNION
        /*se crearon dos objetos mas que guardan el mismo valor que el primero, esto para
        hacer la union, ya que sin esto se guarda la ultima operacion y no dara los valores
        correctos y por ende no hara la union de ambos conjuntos.
        NOTA.....  agregar los metodos conjunto2.add y conjuntoc2.add a su respectivo for. 
        */
        Set<Integer> conjuntob2 = new HashSet<>();
        Set<Integer> conjuntoc2 = new HashSet<>();

        // se crea un ciclo for con 2 condiciones (if) a cumplir nums div entre 3 y nums div entre 5.
        for (int i = 1; i <= 1000; i++) { //inicia en 1, llega hasta 1000 y va de uno en uno.
            if ((i % 3) == 0) {//inicio 1er if, condicion de que sea divisible entre 3 y res sea 0
                conjuntob.add(i);//se agregan al conjuntob mediante el metodo .add
                conjuntob2.add(i);//metodo exclusivo para la union
                
                
            }//fin 1er if
            
            if ((i % 5) == 0) {//inicio 2do if, condicion de que sea divisible entre 5 y res sea 0
                conjuntoc.add(i);//se agregan al conjuntoc mediante el metodo .add
                conjuntoc2.add(i);//metodo exclusivo para la union
                
            }//fin 2do if

        }//fin del for
        
        //se imprimen ambos conjuntos el b y el c solo para mostrar cuales son sus valores.
        System.out.println("El conjunto B, conjunto de numeros divisibles entre 3 es el siguiente: " + conjuntob);
        System.out.println("El conjunto C, conjunto de numeros divisibles entre 5 es el siguiente: " + conjuntoc);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        //°°°°°°°°INTERSECCION DE B Y C °°°°°°°°°°°
        conjuntob.retainAll(conjuntoc);//con el metodo retainAll encontramos la interseccion de ambos.
        System.out.println("La interseccion de los conjuntos B y C es: " + conjuntob);//imprimimos y concatenamos.
        
        
        //°°°°°°°°UNION DE B Y C°°°°°°°°°°°°
        conjuntob2.addAll(conjuntoc2);//el metodo .addAll encontramos la union de ambos conjuntos.
        System.out.println("La union de los conjuntos B y C es: " + conjuntob2);//imprimimos y concatenamos
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        
        //(B u C)- (B n C) 
        /*al objero union se la asigno el conjunto resultante de la union de b y c, 
        que se quedo guardado en el objeto conjuntob2 por medio del metodo .addAll
        */
        union.addAll(conjuntob2);
        
        /*al objeto interseccion se le asigno el conjunto resultante de la interseccion b y c, 
        que se quedo guardado en el objeto conjuntob con el metodo .addAll
        */
        interseccion.addAll(conjuntob);
        
        
        
        //con el metodo removeAll eliminamos los duplicados.
        /*ahora al objeto union le removemos todo el conjunto interseccion
        */
        union.removeAll(interseccion);
        System.out.println("La operacion: B+C = <B u C> - <B n C> tiene como resultado: " + union);
        //ahora imprimimos una frase y concatenamos union.
        
         
    }//fin del metodo main

}//fin del bloque de la clase Conjuntos2
