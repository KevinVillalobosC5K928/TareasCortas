import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        estimarPi ePi = new estimarPi();//Llamar las clases
        Scanner sc = new Scanner(System.in);//Metodo para ingresar datos
        
        System.out.print("Ingrese el lado del cuadrado: ");
        int lado = sc.nextInt();
        
        System.out.print("Ingrese la cantidad de puntos: ");
        int n = sc.nextInt();
        
        //Llamando a los metodos
        double montecarlo = ePi.montecarlo(lado, n);
        double leibniz = ePi.leibniz(n);
        //Calculando la diferencia
        double mDiferencia = montecarlo - Math.PI;
        double lDiferencia = leibniz - Math.PI;
        
        
        System.out.println("Metodo Montecarlo: " + montecarlo + ", hay una diferencia de " + mDiferencia);
        System.out.println("Metodo Leibniz: " + leibniz + ", hay una diferencia de " + mDiferencia);
    }
}