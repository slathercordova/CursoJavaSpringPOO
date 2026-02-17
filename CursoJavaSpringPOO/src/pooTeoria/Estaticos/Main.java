package pooTeoria.Estaticos;

public class Main {
    static void main(String[] args) {
        double factorialRes = Calculadora.factorial(100);
        System.out.println(factorialRes);

        Usuario usuario1 = new Usuario("LCORDOVA","12345678");
        Usuario usuario2 = new Usuario("CLFORES","87654321");
        Usuario usuario3 = new Usuario("CHAPPIE","0410");
        System.out.println(Usuario.getNumeroUsuarios());
    }
}
