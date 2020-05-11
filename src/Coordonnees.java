import java.util.List;

public class Coordonnees {

    private int abscisse;
    private int ordonnee;
    private Navire navire;

    public Coordonnees(int abscisse, int ordonnee, Navire navire){
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.navire = navire;
    }

    public Coordonnees calculerCoordonneeEnDirectionDe(Orientation orientation){
        int nouvelleAbscisse = this.abscisse;
        int nouvelleOrdonnee = this.ordonnee;

        //Faire le calcul de la nouvelle abscisse ou de la nouvelle ordonnée
        switch(orientation){
            case NORD:
                nouvelleAbscisse = getAbscisse();
                nouvelleOrdonnee = getOrdonnee() + getNavire().getTaille();
                break;
            case SUD:
                nouvelleAbscisse = getAbscisse();
                nouvelleOrdonnee = getOrdonnee() - getNavire().getTaille();
                break;
            case EST:
                nouvelleAbscisse = getAbscisse() + getNavire().getTaille();
                nouvelleOrdonnee = getOrdonnee();
                break;
            case OUEST:
                nouvelleAbscisse = getAbscisse() - getNavire().getTaille();
                nouvelleOrdonnee = getOrdonnee();
                break;
        }

        Coordonnees nouvelleCoordonnee = new Coordonnees(nouvelleAbscisse, nouvelleOrdonnee);

        return nouvelleCoordonnee;
    }

    @Override
    public String toString() {
        return "Coordonnees{" +
                "abscisse='" + abscisse + '\'' +
                ", ordonnee=" + ordonnee +
                '}';
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public Navire getNavire() { return navire; }
}
