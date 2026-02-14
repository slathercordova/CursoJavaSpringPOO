package pooTeoria.Ejercicios.Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Library {
    private String nombre;
    private ArrayList<LibraryItem> libraryItems = new ArrayList<>();
    private ArrayList<LibraryUser> libraryUser = new ArrayList<>();
    private HashMap<Integer,LibraryUser> prestamosHash = new HashMap<>();

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
        for (LibraryItem i : libraryItems){
            if (i.getItemID() == itemAgregar.getItemID()){
                System.out.println("El item con Id "+itemAgregar.getItemID()+" ya existe");
                return;
            }
        }

        libraryItems.add(itemAgregar);
        System.out.println("Item agregado");
    }

    public void addUser(LibraryUser itemUser){
        for (LibraryUser i : libraryUser){
            if (i.getUserId().equals(itemUser.getUserId())){
                System.out.println("El usuario con Id "+itemUser.getUserId()+" ya existe");
                return;
            }
        }

        libraryUser.add(itemUser);
        System.out.println("Usuario agregado");
    }

    public ArrayList<LibraryUser> getLibraryUser() {
        return libraryUser;
    }

    public void setLibraryUser(ArrayList<LibraryUser> libraryUser) {
        this.libraryUser = libraryUser;
    }

    public String showAllItems(){
        String resultado = "";
        for (LibraryItem item : libraryItems){
            resultado += item.showDetails()+'\n';
        }
        for (LibraryUser item : libraryUser){
            resultado += item.showUserDetails()+'\n';
        }
        return resultado;
    }

    public void loanItem(int itemId, String userId){
        //  verificar que exista el item id --> si no existe anular operación
        LibraryItem res = recorrerItems(itemId);
        //  verificar que exista el user id --> si no existe anular operación
        LibraryUser res2 = recorrerUsuarios(userId);

        if (res!=null && res2!=null){
            if (!res.getIsLoaned()){
                res.setIsLoaned(true);
                res2.getLoanedItems().add(res);
                prestamosHash.put(itemId,res2);
            }else {
                System.out.println("El item está alquilado, debe esperar que lo devuelvan...");
            }
        }else {
            System.out.println("El item ingresado o el usuario no existe en esta librería!!!, verificar...");
        }
    }

    public void returnItem(int itemId, String userId){
        LibraryItem res = recorrerItems(itemId);
        LibraryUser res2 = recorrerUsuarios(userId);
        if (res!=null && res2!=null){
            if (res.getIsLoaned()){
                res.setIsLoaned(false);
                res2.getLoanedItems().remove(res);
                prestamosHash.remove(itemId);
            }else {
                System.out.println("El item ya está devuelto, de donde salió ese libro?");
            }
        }else {
            System.out.println("El item ingresado o el usuario no existe!!!, verificar...");
        }
    }

    public LibraryItem recorrerItems(int itemId){
        for (LibraryItem i : libraryItems){
            if (i.getItemID() == itemId){
                LibraryItem res = i;
                return res;
            }
        }
        return null;
    }

    public LibraryUser recorrerUsuarios(String userId){
        for (LibraryUser i : libraryUser){
            if (i.getUserId().equals(userId)){
                LibraryUser res = i;
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

    public void verificarPrestamo(int itemId){
        LibraryItem res = recorrerItems(itemId);
        if (res!=null){
            /*if(res.getIsLoaned()){
                //  buscamos al que lo alquilo
                for (LibraryUser i : libraryUser){
                    for (LibraryItem li : i.getLoanedItems()){
                        if (li.getItemID()==itemId){
                            System.out.println("El libro está alquilado por "+i.getUserName());
                            return;
                        }
                    }
                }
            }else {
                System.out.println("El libro no está alquilado");
            }*/
            if (prestamosHash.containsKey(itemId)){
                LibraryUser usuPres = prestamosHash.get(itemId);
                System.out.println("El libro está alquilado por "+usuPres.getUserName());
            }else{
                System.out.println("El libro no está alquilado");
            }
        }else {
            System.out.println("El id ingresado no existe");
        }
    }
}
