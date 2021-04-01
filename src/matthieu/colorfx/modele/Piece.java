package matthieu.colorfx.modele;

public class Piece {

    private String nom;
    private String couleur;
    private String image;

    public Piece(String nom, String couleur, String image) {
        this.nom = nom;
        this.couleur = couleur;
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
