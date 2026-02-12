package pooTeoria.Ejercicios.Ejercicio4;

public class Main {
    static void main(String[] args) {
        LibraryItem book1 = new Book("Libro 1",1,false,"Pepito");
        System.out.println(book1.showDetails());

        Book book2 = new Book("Libro 2",2,false,"Pepito 2");
        System.out.println(book2.showDetails());

        LibraryItem item1 = new LibraryItem("Item 1",3,false);
        System.out.println(item1.showDetails());

        Book book3 = (Book) book1;
        System.out.println(book3.showDetails());

        LibraryItem item2 = book2;
        System.out.println(item2.showDetails());

    }
}
