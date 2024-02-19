//Otero Cabrero Moises actividad 2
package Main;

import java.util.Scanner;
import MetodosOrdenamiento.burbleSort;
import MetodosOrdenamiento.insertSort;
import MetodosOrdenamiento.selectionSort;

/**
 *
 * @author Bocchi
 */
public class main {
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu (){
        int arreglo[] = {10,58,894,154,32,154,14,87,36,65};
        Scanner resp = new Scanner(System.in);
        int num =0;
        while(num != 4){
        num =0;
        System.out.println("Que quiere realizar\n1.Metodo burbuja\n2.Metodo de seleccion\n3.Metodo de insercion\n4.Salir");
        num = resp.nextInt();
            switch(num){
                case 1:{
                    burble(arreglo);
                    break;
                }
                case 2:{
                    seleccion(arreglo);
                    break;
                }
                case 3:{
                    insercion(arreglo);
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Ponga una opcion");
            }
        }
    }
    public static void burble(int arreglo[]){
        burbleSort burble = new burbleSort();
        burble.ordenamiento(arreglo);
    }
    public static void seleccion(int arreglo[]){
        selectionSort select = new selectionSort();
        select.ordenamiento(arreglo);
    }
    public static void insercion(int arreglo[]){
        insertSort insert = new insertSort();
        insert.ordenamiento(arreglo);
    }
    
}
