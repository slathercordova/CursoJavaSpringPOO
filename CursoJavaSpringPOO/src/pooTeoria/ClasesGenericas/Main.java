package pooTeoria.ClasesGenericas;

public class Main {
    static void main(String[] args) {
        TuplaGenerica<String, Integer> listaGenerica1 = new TuplaGenerica<>("Slather",32);
        TuplaGenerica<String, String> listaGenerica2 = new TuplaGenerica<>("Slather","Córdova");
        TuplaGenerica<Integer, Integer> listaGenerica3 = new TuplaGenerica<>(23,32);

        System.out.println(listaGenerica1.toString());
    }
}
