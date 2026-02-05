package Clase_1.Variables;

public class Tipo_Datos {
    public static void main(String[] args) {

        //  variables numericas
        byte a = 127;
        int edad = 32;

        float salario = 1599.99f;
        double precio = 129.999;


        //  variables caracter
        char num = '9';
        char sexo = 'M';

        String nombre = "Slather Córdova";
        String ciudad = "Lima";


        //  variables booleanas
        boolean valor = true;
        boolean valor2 = false;


        //  Mi nombre es ....., soy de .... y tengo .... años
        //System.out.println("Mi nombre es: "+nombre+", soy de "+ciudad+" y tengo "+edad+" años");
        String resultado = String.format("Mi nombre es: %s, soy de %s y tengo %d años", nombre, ciudad, edad);
        System.out.println(resultado);


        //  operaciones con variables
        int num1 = 10;
        int num2 = 3;
        int respuesta = num1 + num2;
        System.out.println(respuesta);

        //  division
        int respuesta2 = num1/num2;
        System.out.println(respuesta2);

        /*
        | Tipo   | Bits | Bytes | Rango                          |
        | ------ | ---- | ----- | ------------------------------ |
        | byte   | 8    | 1     | -128 a 127                     |
        | short  | 16   | 2     | -32,768 a 32,767               |
        | int    | 32   | 4     | -2,147,483,648 a 2,147,483,647 |
        | long   | 64   | 8     | ±9.22 × 10¹⁸                   |
        | float  | 32   | 4     | ~7 dígitos                     |
        | double | 64   | 8     | ~16 dígitos                    |
         */

        //  Operador modulo %
        System.out.println(15%4);
    }
}
