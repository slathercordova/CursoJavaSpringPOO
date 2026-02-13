package pooTeoria.Ejercicios.Ejercicio4;

import java.util.ArrayList;

public class LibraryUser {
    //  usuario de la biblioteca
    private String userName;
    private String userId;
    private ArrayList<LibraryItem> loanedItems;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<LibraryItem> getLoanedItems() {
        return loanedItems;
    }

    public void setLoanedItems(ArrayList<LibraryItem> loanedItems) {
        this.loanedItems = loanedItems;
    }

    public String showUserDetails() {
        return "LibraryUser{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", loanedItems=" + loanedItems +
                '}';
    }
}
