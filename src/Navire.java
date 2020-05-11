public enum Navire {
    FREGATE(1),
    CROISEUR(2),
    DESTROYER(3),
    PORTE_AVION(4);

    private int taille;

    Navire(int taille) {
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }
}
