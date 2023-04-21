package ejerciciosdejavaescuela;

import java.util.*;

public class Palindromo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor ingrese un número: ");
        int num = entrada.nextInt();

        if (esPalindromo(num)) {
            System.out.println(num + " El numero que ingresaste es un palíndromo, wiiiii!");
        } else {
            System.out.println(num + " El numero que ingresaste no es un palíndromo, buuuuu!");
        }
    }

    public static boolean esPalindromo(int num) {
        Deque<Integer> cola = new ArrayDeque<>();
        int temp = num;
        while (temp > 0) {
            cola.addLast(temp % 10);
            temp /= 10;
        }

        while (cola.size() > 1) {
            if (!cola.removeFirst().equals(cola.removeLast())) {
                return false;
            }
        }

        return true;
    }
}
