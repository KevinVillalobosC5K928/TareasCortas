import java.util.ArrayList;
import java.util.Random;

public class NanoPrueba
{
    public static void main(String[] args){
        int n = 100000;
        ArrayList<Integer> arreglo = new ArrayList<>();
        ArbolBinario arbol = new ArbolBinario();
        ListaEnlazada lista = new ListaEnlazada();
        
        Random random = new Random();
        //Rellenando las estructuras de datos
        for (int i = 0; i < n; i++) {
            int num = random.nextInt(10000000);
            arreglo.add(num);
            lista.agregar(num);
            arbol.insertar(num);
        }
        
        //Primer ciclo
        //Arreglo Dinamico
        long arregloInicio1 = System.nanoTime();
        arreglo.add(0, 67);
        arreglo.add(6767);
        int idx = arreglo.indexOf(67);
        arreglo.remove(Integer.valueOf(67));
        for (int num : arreglo) { }
        long arregloFinal1 = System.nanoTime();
        
        
        //Arbol
        long arbolInicio1 = System.nanoTime();
        arbol.insertar(67);
        arbol.insertar(676);//no encontre forma de insertar al final o inicio, entonces agrego 2 para simular los 2 precesos
        arbol.buscar(676);
        arbol.eliminar(67);
        arbol.recorrer();
        long arbolFinal1 = System.nanoTime();
        
        
        //Lista Enlazada
        long listaInicio1 = System.nanoTime();
        lista.agregar(1);
        lista.agregarAlInicio(2);
        lista.buscar(1);
        lista.eliminar(2);
        lista.recorrer();
        long listaFinal1 = System.nanoTime();
        
        
        //Segundo ciclo
        long arregloInicio2 = System.nanoTime();
        arreglo.add(0, 67);
        arreglo.add(6767);
        int idx2 = arreglo.indexOf(67);
        arreglo.remove(Integer.valueOf(67));
        for (int num : arreglo) { }
        long arregloFinal2 = System.nanoTime();
        
        
        //Arbol
        long arbolInicio2 = System.nanoTime();
        arbol.insertar(67);
        arbol.insertar(676);
        arbol.buscar(676);
        arbol.eliminar(67);
        arbol.recorrer();
        long arbolFinal2 = System.nanoTime();
        
        
        //Lista Enlazada
        long listaInicio2 = System.nanoTime();
        lista.agregar(1);
        lista.agregarAlInicio(2);
        lista.buscar(1);
        lista.eliminar(2);
        lista.recorrer();
        long listaFinal2 = System.nanoTime();
        
        //Tercer ciclo
        long arregloInicio3 = System.nanoTime();
        arreglo.add(0, 67);
        arreglo.add(6767);
        int idx3 = arreglo.indexOf(67);
        arreglo.remove(Integer.valueOf(67));
        for (int num : arreglo) { }
        long arregloFinal3 = System.nanoTime();
        
        
        //Arbol
        long arbolInicio3 = System.nanoTime();
        arbol.insertar(67);
        arbol.insertar(676);//no encontre forma de insertar al final o inicio, entonces agrego 2 para simular los 2 precesos
        arbol.buscar(676);
        arbol.eliminar(67);
        arbol.recorrer();
        long arbolFinal3 = System.nanoTime();
        
        
        //Lista Enlazada
        long listaInicio3 = System.nanoTime();
        lista.agregar(1);
        lista.agregarAlInicio(2);
        lista.buscar(1);
        lista.eliminar(2);
        lista.recorrer();
        long listaFinal3 = System.nanoTime();
        
        System.out.println("Arreglo dinamico Primer ciclo: "+(arregloFinal1 - arregloInicio1)+" Arreglo dinamico Segundo ciclo: "+(arregloFinal2 - arregloInicio2)+" Arreglo dinamico Tercer ciclo: "+ (arregloFinal3 - arregloInicio3) +"\n");
        System.out.println("Arbol Binario Primer ciclo: " + (arbolFinal1 - arbolInicio1) +" Arbol Binario Segundo ciclo: " + (arbolFinal2 - arbolInicio2) + " Arbol Binario Tercer ciclo: "  + (arbolFinal3 - arbolInicio3 )+ "\n");
        System.out.println("Lista Enlazada Primer ciclo: "   + (listaFinal1 - listaInicio1) +" Lista Enlazada Segundo ciclo: " + (listaFinal2 - listaInicio2) +" Lista Enlazada Tercer ciclo: "  + (listaFinal3 - listaInicio3) + "\n");
    }
}