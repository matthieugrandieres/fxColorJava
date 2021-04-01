package matthieu.colorfx.modele;

import javafx.scene.layout.Pane;

public class Plateau {

    private String[] cases;
    private Piece[] piecesNoires;
    private Piece[] piecesBlanches;

    public void init(){

    }

    public void deplacement(){

    }

    public Piece[] getPiecesNoires() {
        return piecesNoires;
    }

    public void setPiecesNoires(Piece[] piecesNoires) {
        this.piecesNoires = piecesNoires;
    }

    public Piece[] getPiecesBlanches() {
        return piecesBlanches;
    }

    public void setPiecesBlanches(Piece[] piecesBlanches) {
        this.piecesBlanches = piecesBlanches;
    }

    public static void backgroundColorPair(int min, int max, Pane[] array){
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                array[i].setStyle("-fx-background-color: grey");
            }
        }
    }

    public static void backgroundColorImpair(int min, int max, Pane[] array){
        for (int i = min; i <= max; i++) {
            if (i % 2 == 1) {
                array[i].setStyle("-fx-background-color: grey");
            }
        }
    }
}
