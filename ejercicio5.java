import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Apellido de la persona?");
        String apellido = sc.nextLine();
        System.out.println("¿Nombre de la persona?");
        String nombre = sc.nextLine();
        System.out.println("¿Puesto?");
        System.out.println("1 - Agente de servicio");
        System.out.println("2 - Empleado de oficina");
        System.out.println("3 - Directivo");
        int puesto = sc.nextInt();
        System.out.println("Número de horas trabajadas");
        int horas = sc.nextInt();
        System.out.println("¿Tarifa horaria?");
        double tarifa = sc.nextDouble();
        System.out.println("¿Número de hijos?");
        int hijos = sc.nextInt();
        double salarioBruto = 0;
        double deducciones = 0;
        double salarioNeto = 0;
        double primaFamiliar = 0;
        double salarioNetoPagar = 0;
        String estado = "";
        if (puesto == 1) {
            estado = "Agente de servicio";
        } else if (puesto == 2) {
            estado = "Empleado de oficina";
        } else if (puesto == 3) {
            estado = "Directivo";
        } else {
            estado = "Puesto incorrecto";
        }
        if (horas < 169) {
            salarioBruto = horas * tarifa;
        } else if (horas >= 169 && horas <= 180) {
            salarioBruto = (169 * tarifa) + ((horas - 169) * (tarifa * 1.5));
        } else if (horas > 180) {
            salarioBruto = (169 * tarifa) + (11 * (tarifa * 1.5)) + ((horas - 180) * (tarifa * 1.6));
        }
        if (hijos == 1) {
            primaFamiliar = 20;
        } else if (hijos == 2) {
            primaFamiliar = 50;
        } else if (hijos > 2) {
            primaFamiliar = 70 + ((hijos - 2) * 20);
        }
        deducciones = (salarioBruto *   3.49 / 100) + (salarioBruto * 6.15 / 100) + (salarioBruto * 0.95 / 100) + (salarioBruto * 8.44 / 100) + (salarioBruto * 3.05 / 100) + (salarioBruto * 3.81 / 100) + (salarioBruto * 1.02 / 100);
        salarioNeto = salarioBruto - deducciones;
        salarioNetoPagar = salarioNeto + primaFamiliar;
        System.out.println("Nómina de " + nombre + " " + apellido);
        System.out.println("Estado : " + estado);
        System.out.println("Salario bruto: " + salarioBruto + " € (169 horas sin incremento, 11 horas con incremento del 50 %, 10 horas con incremento del 60 %)");
        System.out.println("Cálculo de deducciones:");
        System.out.println("Contribución para el pago de la deuda social y contingencias comunes imponible");
        System.out.println(salarioBruto + " € × 3,49 % = " + (salarioBruto * 3.49 / 100) + " €");
        System.out.println("Contribución de contingencias comunes no imponible");
        System.out.println(salarioBruto + " € × 6,15 % = " + (salarioBruto * 6.15 / 100) + " €");
        System.out.println("Seguro médico");
        System.out.println(salarioBruto + " € × 0,95 % = " + (salarioBruto * 0.95 / 100) + " €");
        System.out.println("Fondo de pensiones");
        System.out.println(salarioBruto + " € × 8,44 % = " + (salarioBruto * 8.44 / 100) + " €");
        System.out.println("Seguro de desempleo");
        System.out.println(salarioBruto + " € × 3,05 % = " + (salarioBruto * 3.05 / 100) + " €");
        System.out.println("Pensión complementaria (Entidad privada)");
        System.out.println(salarioBruto + " € × 3,81 % = " + (salarioBruto * 3.81 / 100) + " €");
        System.out.println("Contribución de jubilación anticipada");
        System.out.println(salarioBruto + " € × 1,02 % = " + (salarioBruto * 1.02 / 100) + " €");
        System.out.println("Deducciones totales de los empleados: " + deducciones + " €");
        System.out.println("Salario neto: " + salarioNeto + " €");
        System.out.println("Prima familiar: " + primaFamiliar + " €");
        System.out.println("Salario neto a pagar: " + salarioNetoPagar + " €");
    }
}
    