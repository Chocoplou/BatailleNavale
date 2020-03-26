public enum Navire {
    FREGATE(1),
    CROISEUR(2),
    DESTROYER(3),
    PORTE_AVION(4);

    private int taille;

    Navire(int abreviation) {
        this.taille = abreviation;
    }

    public int getTaille() {
        return taille;
    }
}
