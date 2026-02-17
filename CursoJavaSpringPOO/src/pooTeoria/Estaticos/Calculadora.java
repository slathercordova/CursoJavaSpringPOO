package pooTeoria.Estaticos;

public class Calculadora {
    final static double PI = Math.PI;

    static double suma(int a, int b){
        return a+b;
    }

    static double factorial(int a){
        double factorial = 1;
        for (int i = a; i >= 1 ; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
