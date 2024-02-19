//burble sort 22310402
package MetodosOrdenamiento;

public class burbleSort {
    
    public void ordenamiento(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length-1; j++) {
                if(arreglo[j]>arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
            mostrar(arreglo);
        }
    }
    public void mostrar(int arreglo[]){
        String valor ="";
        for (int i = 0; i < arreglo.length; i++) {
            valor += arreglo[i] + ", ";
        }
        System.out.println(valor);
    }
}
