package matthieu.colorfx.modele;

public class Partie {

    private Plateau plateau;
    private Deplacement deplacement;
    private int tour;

    public Partie(Plateau plateau, Deplacement deplacement, int tour) {
        this.plateau = plateau;
        this.deplacement = deplacement;
        this.tour = tour;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public Deplacement getDeplacement() {
        return deplacement;
    }

    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }

    public int getTour() {
        return tour;
    }

    public void setTour(int tour) {
        this.tour = tour;
    }

    public void faireDeplacement(){

    }

    public void nouvellePartie(){

    }

    public void annulationDeplacement(){

    }

}
