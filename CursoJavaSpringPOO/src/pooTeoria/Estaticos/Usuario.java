package pooTeoria.Estaticos;

public class Usuario {
    private String username;
    private String password;
    static int numeroUsuarios = 0;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
        numeroUsuarios++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getNumeroUsuarios() {
        return numeroUsuarios;
    }

    public static void setNumeroUsuarios(int numeroUsuarios) {
        Usuario.numeroUsuarios = numeroUsuarios;
    }
}
