public class ArbolBinario {

    private NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoArbol insertarRec(NodoArbol nodo, int valor) {
        if (nodo == null) return new NodoArbol(valor);

        if (valor < nodo.valor)
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        else if (valor > nodo.valor)
            nodo.derecho = insertarRec(nodo.derecho, valor);
        

        return nodo;
    }

    
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(NodoArbol nodo, int valor) {
        if (nodo == null) return false;
        if (valor == nodo.valor) return true;

        if (valor < nodo.valor)
            return buscarRec(nodo.izquierdo, valor);
        else
            return buscarRec(nodo.derecho, valor);
    }

        public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private NodoArbol eliminarRec(NodoArbol nodo, int valor) {
        if (nodo == null) {
            System.out.println("Valor " + valor + " no encontrado.");
            return null;
        }

        if (valor < nodo.valor)
            nodo.izquierdo = eliminarRec(nodo.izquierdo, valor);
        else if (valor > nodo.valor)
            nodo.derecho = eliminarRec(nodo.derecho, valor);
        else {
            if (nodo.izquierdo == null && nodo.derecho == null)
                return null;
            if (nodo.izquierdo == null) return nodo.derecho;
            if (nodo.derecho == null)   return nodo.izquierdo;
            
            int minValor = minimo(nodo.derecho);
            nodo.valor = minValor;
            nodo.derecho = eliminarRec(nodo.derecho, minValor);
        }
        return nodo;
    }
    
    private int minimo(NodoArbol nodo) {
    return (nodo.izquierdo == null) ? nodo.valor : minimo(nodo.izquierdo);
    }
    
    public int tamanio() {
        return tamanioRec(raiz);
    }
    
    private int tamanioRec(NodoArbol nodo) {
        if (nodo == null) return 0;
        return 1 + tamanioRec(nodo.izquierdo) + tamanioRec(nodo.derecho);
    }
    
    public void recorrer() {
        recorrerRec(raiz);
    }
    
    private void recorrerRec(NodoArbol nodo) {
        if (nodo == null) return;
        recorrerRec(nodo.izquierdo);
        recorrerRec(nodo.derecho);
    }


}