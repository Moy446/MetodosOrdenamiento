//Selection sort 22310402
package MetodosOrdenamiento;

/**
 *
 * @author Bocchi
 */
public class selectionSort {
    
    public void ordenamiento(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            int menor = i;
            for (int j = i+1; j < arreglo.length; j++) {
                if (arreglo[j]< arreglo[menor]){
                    menor = j;
                }
            }
            if (true) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[menor];
                arreglo[menor] = aux;
            }
            mostrar(arreglo);
        }
    }
    public void mostrar(int arreglo[]){
        String valor ="";
        for (int i = 0; i < arreglo.length; i++) {
            valor +=arreglo[i]+", " ;
        }
        System.out.println(valor);
    }
}
