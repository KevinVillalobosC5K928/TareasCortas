import java.util.Scanner;

public class Menu {
    
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = true;
        
        do {
            // Mostrar opciones
            System.out.println("\nConversor de unidades");
            System.out.println("1. Metros a kilómetros");
            System.out.println("2. Kilómetros a millas");
            System.out.println("3. Millas a kilómetros");
            System.out.println("4. Metros a yardas");
            System.out.println("5. Salir");
            
            // Solicitar opción
            System.out.print("\nSeleccione el tipo de conversión: ");
            int opcion = scanner.nextInt();
            
            // Si elige salir, terminar el bucle
            if (opcion == 5) {
                salir = false;
                System.out.println("Cerrando el programa");
                break;
            }
            
            // Solicitar valor a convertir
            System.out.print("Ingrese el valor: ");
            double valor = scanner.nextDouble();
            
            // Realizar la conversión según la opción
            Conversor conversion = null;
            
            switch (opcion) {
                case 1:
                    conversion = Conversor.metrosAKilometros(valor);
                    break;
                case 2:
                    conversion = Conversor.kilometrosAMillas(valor);
                    break;
                case 3:
                    conversion = Conversor.millasAKilometros(valor);
                    break;
                case 4:
                    conversion = Conversor.metrosAYardas(valor);
                    break;
                default:
                    System.out.println("Opción no válida");
                    continue;
            }
            
            // Mostrar el resultado
            if (conversion != null) {
                conversion.mostrarResultado(valor);
            }
            
        } while (salir);
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        mostrarMenu();
    }
}