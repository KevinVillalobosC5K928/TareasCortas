

public class Conversor
{
    static double resultado;
    static String unidadOriginal;
    static String unidadNueva;
    
    public Conversor(double resultado, String unidadOriginal, String unidadNueva){
        this.resultado = resultado;
        this.unidadOriginal = unidadOriginal;
        this.unidadNueva = unidadNueva;
        
    }
    
        //Metodos para convntir
    public static Conversor metrosAKilometros(double metros) {
        double resultado = metros / 1000;
        return new Conversor(resultado, "m", "km");
    }
    
    public static Conversor kilometrosAMillas(double kilometros) {
        double resultado = kilometros * 0.62137;
        return new Conversor(resultado, "km", "mi");
    }

    public static Conversor millasAKilometros(double millas) {
        double resultado = millas * 1.60934;
        return new Conversor(resultado, "mi", "km");
    }

    public static Conversor metrosAYardas(double metros) {
        double resultado = metros * 1.09361;
        return new Conversor(resultado, "m", "yd");
    }
    
    
    
    // Método para mostrar el resultado
    public void mostrarResultado(double valorOriginal) {
        System.out.println(valorOriginal + " " + unidadOriginal + " = " + resultado + " " + unidadNueva);
    }
    
    
    
    // Getters
    public double getResultado() {
        return resultado;
    }
    
    public String getUnidadOriginal() {
        return unidadOriginal;
    }
    
    public String getUnidadNueva() {
        return unidadNueva;
    }
}

