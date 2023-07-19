import java.util.Scanner;

/* Reto Mouredev
 * Reto #5
 * ÁREA DE UN POLÍGONO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class Main {
    public static void main(String[] args) {
        int poli;
        double base = 0;
        double altura = 0;


        do {
            System.out.println("Elige el tipo de polígono: [1. Triángulo, 2. Cuadrado, 3. Rectángulo, 0. Salir]: ");
            Scanner scanner = new Scanner(System.in);
            poli = scanner.nextInt();

            switch (poli){
                case 1:
                    System.out.println("¿Qué base quieres que tenga tu triángulo?");
                    scanner = new Scanner(System.in);
                    base = scanner.nextDouble();

                    System.out.println("¿Qué altura quieres que tenga tu triángulo?");
                    scanner = new Scanner(System.in);
                    altura = scanner.nextDouble();
                    break;
                case 2:
                    System.out.println("¿Cuánto quieres que midan los lados de tu cuadrado?");
                    scanner = new Scanner(System.in);
                    base = scanner.nextDouble();
                    altura = base;
                    break;
                case 3:
                    System.out.println("¿Qué base quieres que tenga tu rectángulo?");
                    scanner = new Scanner(System.in);
                    base = scanner.nextDouble();

                    System.out.println("¿Qué altura quieres que tenga tu rectángulo?");
                    scanner = new Scanner(System.in);
                    altura = scanner.nextDouble();
                    break;
                case 0:
                    System.out.println("El programa se cerrará... ");
                    System.out.println("----------");
                    break;
                default:
                    System.out.println("Polígono incorrecto");
                    System.out.println("----------");
                    break;
            }
            if (poli > 0 && poli < 4){
                calAreaPoli(poli, base, altura);
                System.out.println("----------");
            }
        }while (poli != 0);
        System.out.println("Programa cerrado con éxito");
    }

    public static void calAreaPoli(int poli, double base, double altura){

        double area = 0;

        switch (poli){
            case 1:
                area = (base * altura) / 2;
                System.out.println("El área de un triangulo es: " + area);
                break;
            case 2:
                area = base * altura;
                System.out.println("El área de un cuadrado es: " + area);
                break;
            case 3:
                area = base * altura;
                System.out.println("El área de un rectángulo es: " + area);
                break;
        }
    }
}