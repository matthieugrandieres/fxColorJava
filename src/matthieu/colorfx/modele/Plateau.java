package matthieu.colorfx.modele;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Plateau {

    private String[] cases;
    private Piece[] piecesNoires;
    private Piece[] piecesBlanches;

    public void init(){

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

    public static void deplacement(int num, ImageView[] arrayAllImage){

        arrayAllImage[num].setOnMouseClicked(event -> {

            if (arrayAllImage[num].getId() != null) {
                //System.out.println(arrayAllImage[0].getId());
                final String[] img = {arrayAllImage[num].getId()};
                for (int j = 0; j < 63; j++) {
                    int finalJ = j;
                    arrayAllImage[j].setOnMouseClicked(event1 -> {
                        arrayAllImage[finalJ].setImage(new Image(img[0]));
                        arrayAllImage[finalJ].setId(img[0]);
                        arrayAllImage[num].setImage(null);
                        arrayAllImage[num].setId(null);
                        System.out.println(arrayAllImage[1].getId());
                        img[0] = null;
                    });
                    if (img[0] == null) {
                        break;
                    }

                }
            }
        });
    }
}
