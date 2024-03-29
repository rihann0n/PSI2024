package unidad2;
import java.util.Scanner;
/*Vamos a resolver el ejercicio utilizando una estructura switch
en lugar de if's anidados.*/
public class Actividad2_10b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una nota: ");
        int nota = sc.nextInt();
        switch (nota) {
            case 0, 1, 2, 3, 4 ->
                    System.out.println("Insuficiente");
            case 5 ->
                    System.out.println("Suficiente");
            case 6 ->
                    System.out.println("Bien");
            case 7, 8 ->
                    System.out.println("Notable");
            case 9, 10 ->
                    System.out.println("Sobresaliente");
            default ->
                    System.out.println("Error: nota no válida");
        }
    }
}
