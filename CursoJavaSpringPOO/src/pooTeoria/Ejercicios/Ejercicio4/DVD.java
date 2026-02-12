package pooTeoria.Ejercicios.Ejercicio4;

public class DVD extends LibraryItem{
    private String director;
    private int duration;

    public DVD(String title, int itemID, boolean isLoaned, String director, int duration) {
        super(title, itemID, isLoaned);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+
                "DVD{" +
                "director='" + director + '\'' +
                ", duration=" + duration +
                '}';
    }
}
