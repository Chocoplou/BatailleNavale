public class Bateau {

    private String[] coordonnees;
    private Navire modele;
    private String orientation;

    public Bateau(String coordonnes, Navire modele, String orientation){
        this.coordonnees = getCoordonnees();
        this.modele = Navire.getAbreviation;
        this.orientation = getOrientation();
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String[] getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(String[] coordonnees) {
        this.coordonnees = coordonnees;
    }
}
