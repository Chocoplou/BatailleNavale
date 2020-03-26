public class Bateau {

    private Coordonnees coordonnees;
    private Navire modele;
    private Orientation orientation;

    public Bateau(Coordonnees coordonnees, Navire modele, Orientation orientation){
        this.coordonnees = coordonnees;
        this.modele = modele;
        this.orientation = orientation;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public Navire getModele() {
        return modele;
    }

    public Coordonnees getCoordonnees() {
        return coordonnees;
    }
}
