import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean continuar = true;
        double a,b;
        int opcion;
        do {
            System.out.println("Bienvenido a la calculadora!");
            System.out.println("Seleccione una opcion: ");
            System.out.println("0.Salir");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            opcion = read.nextInt();
            if (opcion == 0){
                continuar = false;
                continue;
            }
            System.out.println("Ingrese el primer numero: ");
            a = read.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            b = read.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("La respuesta es: " + sumar(a,b));
                    break;
                case 2:
                    System.out.println("La respuesta es: " + restar(a,b));
                    break;
                case 3:
                    System.out.println("La respuesta es: " + multiplicar(a,b));
                    break;
                case 4:
                    System.out.println("La respuesta es: " + dividir(a,b));
                    break;
                default:
                    break;
            }
        } while (continuar);
    }
    public static double sumar(double a, double b){
        return a + b;
    }

    public static double restar(double a,double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }
}
