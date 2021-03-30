package matthieu.colorfx.modele;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Color {

    /**
     * Valeur rouge entre 0 et 255
     */
    private int red;

    /**
     * Valeur vert entre 0 et 255
     */
    private int green;

    /**
     * Valeur bleu entre 0 et 255
     */
    private int blue;

    /**
     * Valeur hexadécimal
     */
    private String hexValue;

    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 255;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;

        if (this.red < 0 || this.red > 255 || this.green < 0 || this.green > 255 || this.blue < 0 || this.blue > 255) {
            throw new IllegalArgumentException("Error number");
        }
    }

    public Color(String hexValue){
        this.hexValue = hexValue;

        if (!this.hexValue.substring(0, 1).equals("#")){
            throw new IllegalArgumentException("Erreur, ne contient pas de # en première position");
        }

        if (this.hexValue.equals(null)) {
            throw new IllegalArgumentException("Valeur null");
        }

        if (this.hexValue.length() != 7) {
            throw new IllegalArgumentException("Taille incorrect");
        }


        ArrayList<String> lettres = new ArrayList<>();
        lettres.add("A");
        lettres.add("B");
        lettres.add("C");
        lettres.add("D");
        lettres.add("E");
        lettres.add("F");

        System.out.println(this.hexValue.substring(1, 2).getClass().getSimpleName());

        for (int i = 1; i < this.hexValue.length(); i++) {
            if (Integer.parseInt(this.hexValue.substring(i, i + 1)) < 0 ||
                    Integer.parseInt(this.hexValue.substring(i, i + 1)) > 9 )
            {
                throw new IllegalArgumentException("Problème de contenu");
            }

            System.out.println(i);

        }
    }

    public String getHexValue(){
        return this.hexValue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }

    public String toString() {
        return "[value=" + this.hexValue + "]" + "r=" + this.red + "]" + "g=" + this.green + "]" + "b=" + this.blue + "]";
    }

    public int getHexLenght(){
        return hexValue.length();
    }

    public String getFxBackgroundColor(){
        return "-fx-background-color: rgb(" + red + "," + green + "," + blue + ")";

    }

}
