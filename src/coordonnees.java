public class Coordonnees {

    private int abscisse;

    private String ordonnee;

    public Coordonnees(int abscisse, String ordonnee){
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public String getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(String ordonnee) {
        this.ordonnee = ordonnee;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }
}
