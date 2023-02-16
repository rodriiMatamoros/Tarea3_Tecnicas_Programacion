/*Modificar el algoritmo anterior para mostrar un mensaje según la temperatura:

Temperatura

Mensaje

t < 2

Riesgo de hielo

2 ≤ t < 15

Hace frío

15 ≤ t < 30

Buena temperatura

t ≥ 30

Demasiado calor*/

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura: ");
        int temperatura = sc.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        } else if (temperatura >= 2 && temperatura < 15) {
            System.out.println("Hace frío");
        } else if (temperatura >= 15 && temperatura < 30) {
            System.out.println("Buena temperatura");
        } else {
            System.out.println("Demasiado calor");
        }
    }
}   