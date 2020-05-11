public class Jeu {
    public static void main (String[] args){
        System.out.println("Hello World");
        Coordonnees c = new Coordonnees("A", 1);
        Bateau bateau1 = new Bateau(c, Navire.FREGATE, Orientation.SUD);
        System.out.println(bateau1.getCoordonnees());
        System.out.println(bateau1.getModele());
        System.out.println(bateau1.getOrientation());
        System.out.println(bateau1.toString());
    }
}
