package pooTeoria.ClasesGenericas;

public class TuplaGenerica <T,K>{
    private T a;
    private K b;

    public TuplaGenerica(T a, K b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "TuplaGenerica{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
