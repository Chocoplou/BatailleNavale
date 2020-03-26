public enum  Navire {
    FREGATE("F"),
    CROISEUR("C"),
    DESTROYER("D"),
    PORTE_AVION("PA");

    private String abreviation;

    Navire(String abreviation) {
        this.abreviation = abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getAbreviation() {
        return abreviation;
    }
}
