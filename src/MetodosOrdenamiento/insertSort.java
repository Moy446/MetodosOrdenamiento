//insertion sort 22310402
package MetodosOrdenamiento;

/**
 *
 * @author Bocchi
 */
public class insertSort {
    public void ordenamiento(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            int j = i;
            while(j!=0 && arreglo[j]< arreglo[j-1]){
                int temp = arreglo[j];
                arreglo[j] = arreglo[j-1];
                arreglo[j-1] = temp;
                j--;
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
