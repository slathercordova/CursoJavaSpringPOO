package Clase_2.Loops;

public class Ejercicio10 {
    static void main(String[] args) {
        //  Declarar un arreglo de n elementos y buscar el mayor valor.
        int[] lista = {1,4,2,5,7,8,11,3,9,5};
        int mayor = 0;
        for (int i = 0; i < lista.length; i++) {
            if (mayor<lista[i]){
                mayor = lista[i];
            }
        }
        System.out.println("El número mayor es "+mayor);
    }
}
