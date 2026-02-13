package pooTeoria.Ejercicios.Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private String nombre;
    private ArrayList<LibraryItem> libraryItems = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public void setLibraryItems(ArrayList<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    public void addItem(LibraryItem itemAgregar){
        libraryItems.add(itemAgregar);
        System.out.println("Item agregado");
    }

    public String showAllItems(){
        String resultado = "";
        for (LibraryItem item : libraryItems){
            resultado += item.showDetails()+'\n';
        }
        return resultado;
    }

    public void loanItem(LibraryItem itemLoan){
        LibraryItem res = recorrerItems(itemLoan);
        if (res!=null){
            if (!res.getIsLoaned()){
                res.setIsLoaned(true);
            }else {
                System.out.println("El item está alquilado, debe esperar que devuelvan...");
            }
        }else {
            System.out.println("El item ingresado no existe!!!, verificar...");
        }
    }

    public void returnItem(LibraryItem itemLoan){
        LibraryItem res = recorrerItems(itemLoan);
        if (res!=null){
            if (res.getIsLoaned()){
                res.setIsLoaned(false);
            }else {
                System.out.println("El item ya está devuelto, de donde salió ese libro?");
            }
        }else {
            System.out.println("El item ingresado no existe!!!, verificar...");
        }
    }

    public LibraryItem recorrerItems(LibraryItem itemLoan){
        for (LibraryItem i : libraryItems){
            if (i.getItemID() == itemLoan.getItemID()){
                LibraryItem res = i;
                return res;
            }
        }
        return null;
    }

    public String mostrarLibreria() {
        return "Library{" +
                "nombre='" + nombre + '\n' +
                ", libraryItems="+'\n'+
                showAllItems()+
                '}';

    }
}
