package pooTeoria.Ejercicios.Ejercicio4;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        /*LibraryItem book1 = new Book("Libro 1",1,false,"Pepito");
        System.out.println(book1.showDetails());

        Book book2 = new Book("Libro 2",2,false,"Pepito 2");
        System.out.println(book2.showDetails());

        LibraryItem item1 = new LibraryItem("Item 1",3,false);
        System.out.println(item1.showDetails());

        Book book3 = (Book) book1;
        System.out.println(book3.showDetails());

        LibraryItem item2 = book2;
        System.out.println(item2.showDetails());*/

        //  creamos los items
        LibraryItem item1 = new Book("Libro 1",1,false,"Autor 1");
        LibraryItem item2 = new Book("Libro 2",2,false,"Autor 2");
        LibraryItem item3 = new Book("Libro 3",3,false,"Autor 1");
        LibraryItem item4 = new DVD("DVD 1",4,false,"Autor 1",30);
        LibraryItem item5 = new DVD("DVD 2",5,false,"Autor 3",40);
        LibraryItem item6 = new DVD("DVD 3",6,false,"Autor 2",50);

        //  creamos a los usuarios
        LibraryUser usuario1 = new LibraryUser();
        usuario1.setUserId("LCORDOVA");
        usuario1.setUserName("Slather Córdova");

        LibraryUser usuario2 = new LibraryUser();
        usuario2.setUserId("CFLORES");
        usuario2.setUserName("Claudia Flores");

        //  creamos la libreria
        Library libreria = new Library();
        libreria.setNombre("Libreria 1");


        //  FORMA 1

        /*
        //  metemos todos los items creados a un array para pasarlo a la libreria
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(item1);
        libraryItems.add(item2);
        libraryItems.add(item3);
        libraryItems.add(item4);
        libraryItems.add(item5);
        libraryItems.add(item6);
        libreria.setLibraryItems(libraryItems);
        //  metemos todos los items de usuarios a un array para pasarlo a la libreria
        ArrayList<LibraryUser> UserItem = new ArrayList<>();
        UserItem.add(usuario1);
        UserItem.add(usuario2);
        libreria.setLibraryUser(UserItem);

        *//*System.out.println(usuario1.showUserDetails());
        System.out.println(usuario2.showUserDetails());
        *//*
        */

        //  FORMA 2
        libreria.addItem(item1);
        libreria.addItem(item2);
        libreria.addItem(item3);
        libreria.addItem(item4);
        libreria.addItem(item5);
        libreria.addItem(item6);

        //System.out.println(libreria.showAllItems());

        libreria.addUser(usuario1);
        libreria.addUser(usuario2);

        System.out.println("================================");
        System.out.println("INICIO DE LIBRERIA");
        System.out.println(libreria.mostrarLibreria());

        System.out.println("Alquilando el libro "+item1.getItemID()+"-"+item1.getTitle());
        libreria.loanItem(1,"LCORDOVA");
        System.out.println(libreria.mostrarLibreria());

        //  forzamos error porque lo acabamos de alquilar
        System.out.println("FORZAMOS ERROR Alquilando el libro "+item1.getItemID()+"-"+item1.getTitle());
        libreria.loanItem(1,"LCORDOVA");

        //  devolvemos el libro
        System.out.println("Devolviendo el libro "+item1.getItemID()+"-"+item1.getTitle());
        libreria.returnItem(1,"LCORDOVA");
        System.out.println(libreria.mostrarLibreria());

        System.out.println("FORZAMOS ERROR Devolviendo el libro "+item1.getItemID()+"-"+item1.getTitle());
        //  forzamos error en devolver algo que ya está devuelto
        libreria.returnItem(1,"LCORDOVA");

        System.out.println("=================================================");
        System.out.println("===============RESULTADO 2=======================");
        System.out.println("=================================================");
        /*
        * dado un id de un item, quiero saber si está prestado
        * y si está prestado a que usuario le pertenece el prestamo
        * */
        System.out.println("Alquilando el libro "+item5.getItemID()+"-"+item5.getTitle());
        libreria.loanItem(5,"LCORDOVA");
        System.out.println(libreria.mostrarLibreria());

        libreria.verificarPrestamo(5);
    }
}
