import java.util.Random;

public class estimarPi
{
    //Ambos metodos estan en double y no en void para la facilidad el ingresar los datos
    
    //Metodo Montecarlo
    public double montecarlo(int lado, int n){
        Random rd = new Random();
        double radio = lado / 2;
        int puntosAdentro = 0;
        
        for (int i = 0; i < n; i++){
            double x = rd.nextDouble() * lado - radio;
            double y = rd.nextDouble() * lado - radio;
            
            if (x * x + y * y <= radio * radio){
                puntosAdentro++;
            }
        }
        
        return 4.0 * puntosAdentro / n;
    }
    
    //Metodo Leibniz
    public double leibniz(int n){
        double suma = 0.0;
        
        for(int i = 0; i < n; i++){
            double denominador = 2 * i + 1;
            
            if( i % 2 == 0){
                suma += 1 / denominador;
            }else{
                suma -= 1 / denominador;
            }
        }
        
        return 4.0 * suma;
    }
}