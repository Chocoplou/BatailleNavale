public class Coordonnees {

    private String abscisse;
    private int ordonnee;

    public Coordonnees(String abscisse, int ordonnee){
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public String getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(String abscisse) {
        this.abscisse = abscisse;
    }
}
