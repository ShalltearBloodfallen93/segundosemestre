package ejerciciosdejavaescuela;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingresa un número entero para calcular su factorial: ");
        
        int num = numero.nextInt();
        int factorial = 1;
        
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + num + " es " + factorial);
    }
}