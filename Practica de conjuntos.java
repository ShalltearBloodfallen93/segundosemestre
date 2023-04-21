//Leonardo Daniel Martínez Rosas
//from.the.darkness93@gmail.com
//grupo 201
//Practica de conjuntos.

package ejerciciosdejavaescuela;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * @author ShalltearBloodfallen
 */




public class AlfabetoConjuntos {
    public static void main(String[] args) {
        
        //°°°°°ABECEDARIO. CONJUNTO A°°°°°°°°
        HashSet<Character> abecedario = new HashSet<>();
        
        for (char a = 'a'; a <= 'z'; a++) {
            abecedario.add(a);
            
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("El conjunto del abecedario es el siguiente: " + abecedario);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        
        
        
        
        
        
        //°°°°°°NUMEROS ENTEROS muestra el conjunto de >= -300 y <100   CONJUNTO B.°°°°°°°°°
        //el segundo objeto es para la union de conjuntos para no sobreescribir el valor del 1er objeto.
        HashSet <Integer> enteros = new HashSet<>();
        HashSet <Integer> enteros2 = new HashSet<>();//nuevo objeto con el mismo valor
       
        for (int i = -300; i < 100; i++) {
            enteros.add(i);
            enteros2.add(i);
            
            
        }
        
        
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Los numeros mayores a -300 y menores a 100: " + enteros);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        
        
        
        
        
        //°°°°°°°NUMEROS PARES menores a 400. CONJUNTO C.°°°°°°°
        //el segundo objeto es para la union de conjuntos para no sobreescribir el valor del 1er objeto.
         HashSet <Integer> NumPares = new HashSet<>();
         HashSet <Integer> Numpares2 = new HashSet<>();//nuevo objeto con el mismo valor.
        for (int i = 2; i < 400; i+=2) {
            NumPares.add(i);
            Numpares2.add(i);
            
                
            
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Los numeros pares menores a 400 son: " + NumPares);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        
        
        /*°°°°°°°°°°LA INTERSECCION de los conjuntos B y C.°°°°°°°°°
        NOTA: para que funcione hay que hacer primero la interseccion antes de cualquier otra operacion.
        si se hace al ultimo solo hara la inion de ambos conjuntos e imprimira los valores erroneos.
        */
        
        NumPares.retainAll(enteros);
        System.out.println("****************************************************************************************************************************************");
        System.out.println("La interseccin de los conjuntos B y C es: " +  NumPares);
        System.out.println("*************************************************************************************************************************************************");
        
        
        
        
        //°°°°°°°°UNION B Y C. metodo addAll es para la union de conjuntos.°°°°°°°
        //se creaton 2 objetos mas en los conjuntos b y c.
        enteros2.addAll(Numpares2);
        System.out.println("La union de ambos conjuntos es: " + enteros2);
        
        
        
        
        
        //°°°°°°°°°°°°°°SUBCONJUNTO B de C.°°°°°°°°°°°°°
        
        //usamos SortedSet para crear un objeto llamado subconjunto .
        SortedSet subconjunto = new TreeSet();
        
        //con el metodo .addAll agregamos la coleccion de enteros y Numpares al objeto subconjunto de tipo SortedSet.
        subconjunto.addAll(enteros);
        subconjunto.addAll(NumPares);
        
        /*imprimimos una oracion + el metodo .subSet para decir 
        de que elemento queremos el subconjunto y hasta que elemnto llegara.
        */    
        //en este caso el subconjunto de B dado C es: -300 a 400. o bien definir mas subconjuntos.
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("El subconjunto B de C es: " + subconjunto.subSet(-300, 400));
        System.out.println("------------------------------------------------------------------------------------------");
          
       
    }
    
}
