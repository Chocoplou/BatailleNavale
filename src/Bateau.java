import java.util.ArrayList;
import java.util.List;

public class Bateau {

    private Navire modele;
    private Orientation orientation;
    private List<Coordonnees> coordonneesList;

    public Bateau(Coordonnees coordonneeInitiale, Navire modele, Orientation orientation){
        this.modele = modele;
        this.orientation = orientation;
        this.coordonneesList = new ArrayList<>();
        this.coordonneesList.add(coordonneeInitiale);

        Coordonnees coordonneeCourante = coordonneeInitiale;
        for (int i = 1; i < modele.getTaille(); i++){

            //calcul de la coordonnée suivante
            coordonneeCourante = coordonneeCourante.calculerCoordonneeEnDirectionDe(orientation);

            //Ajouter la nouvelle coordonnée à la liste des coordonnées
            this.coordonneesList.add(coordonneeCourante);
        }
    }

    @Override
    public String toString() {
        return "Bateau{" +
                "coordonnees=" + coordonneesList +
                ", modele=" + modele +
                ", orientation=" + orientation +
                '}';
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public Navire getModele() {
        return modele;
    }

    public List<Coordonnees> getCoordonneesList() {
        return coordonneesList;
    }
}
