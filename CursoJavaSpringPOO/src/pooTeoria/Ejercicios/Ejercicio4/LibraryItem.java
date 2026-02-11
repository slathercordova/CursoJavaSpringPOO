package pooTeoria.Ejercicios.Ejercicio4;

public class LibraryItem {
    private String title;
    private int itemID;
    private boolean isLoaned;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public boolean getIsLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    public String showDetails() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", itemID=" + itemID +
                ", isLoaned=" + isLoaned +
                '}';
    }
}
