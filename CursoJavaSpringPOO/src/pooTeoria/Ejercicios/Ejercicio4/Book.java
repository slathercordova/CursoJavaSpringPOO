package pooTeoria.Ejercicios.Ejercicio4;

public class Book extends LibraryItem{
    private String autor;

    public Book(String title, int itemID, boolean isLoaned, String autor) {
        super(title, itemID, isLoaned);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+
                "Book{" +
                "autor='" + autor + '\'' +
                '}';
    }
}
