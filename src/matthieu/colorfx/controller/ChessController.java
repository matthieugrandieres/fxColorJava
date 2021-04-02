package matthieu.colorfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import matthieu.colorfx.modele.Piece;
import matthieu.colorfx.modele.Plateau;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class ChessController implements Initializable {

    private Plateau plateauC;

    private static boolean secondClick = false;

    private static String imageStock;


    @FXML
    private Button buttonAnnuler;

    @FXML
    private Button nouvellePartie;

    @FXML
    private Button quitter;

    @FXML
    private GridPane plateau;

    @FXML
    private ImageView imageA1, imageB1, imageC1, imageD1, imageE1, imageF1, imageG1, imageH1;

    @FXML
    private ImageView imageA2, imageB2, imageC2, imageD2, imageE2, imageF2, imageG2, imageH2;

    @FXML
    private ImageView imageA3, imageB3, imageC3, imageD3, imageE3, imageF3, imageG3, imageH3;

    @FXML
    private ImageView imageA4, imageB4, imageC4, imageD4, imageE4, imageF4, imageG4, imageH4;

    @FXML
    private ImageView imageA5, imageB5, imageC5, imageD5, imageE5, imageF5, imageG5, imageH5;

    @FXML
    private ImageView imageA6, imageB6, imageC6, imageD6, imageE6, imageF6, imageG6, imageH6;

    @FXML
    private ImageView imageA7, imageB7, imageC7, imageD7, imageE7, imageF7, imageG7, imageH7;

    @FXML
    private ImageView imageA8, imageB8, imageC8, imageD8, imageE8, imageF8, imageG8, imageH8;

    @FXML
    private Pane a1, b1, c1, d1, e1, f1, g1, h1;

    @FXML
    private Pane a2, b2, c2, d2, e2, f2, g2, h2;

    @FXML
    private Pane a3, b3, c3, d3, e3, f3, g3, h3;

    @FXML
    private Pane a4, b4, c4, d4, e4, f4, g4, h4;

    @FXML
    private Pane a5, b5, c5, d5, e5, f5, g5, h5;

    @FXML
    private Pane a6, b6, c6, d6, e6, f6, g6, h6;

    @FXML
    private Pane a7, b7, c7, d7, e7, f7, g7, h7;

    @FXML
    private Pane a8, b8, c8, d8, e8, f8, g8, h8;

    @FXML
    private Pane test;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        /**
         * Tableau de cases
         */
        Pane[] arrayPane = {
                a1, b1, c1, d1, e1, f1, g1, h1,
                a2, b2, c2, d2, e2, f2, g2, h2,
                a3, b3, c3, d3, e3, f3, g3, h3,
                a4, b4, c4, d4, e4, f4, g4, h4,
                a5, b5, c5, d5, e5, f5, g5, h5,
                a6, b6, c6, d6, e6, f6, g6, h6,
                a7, b7, c7, d7, e7, f7, g7, h7,
                a8, b8, c8, d8, e8, f8, g8, h8
        };

        /*ImageView[] arrayImageBlanc = {
                imageA1, imageB1, imageC1, imageD1, imageE1, imageF1, imageG1, imageH1,
                imageA2, imageB2, imageC2, imageD2, imageE2, imageF2, imageG2, imageH2,

        };

        ImageView[] arrayImageNoir = {
                imageA8, imageB8, imageC8, imageD8, imageE8, imageF8, imageG8, imageH8,
                imageA7, imageB7, imageC7, imageD7, imageE7, imageF7, imageG7, imageH7
        };*/

        ImageView[] arrayAllImage =
        {
                imageA1, imageB1, imageC1, imageD1, imageE1, imageF1, imageG1, imageH1,
                imageA2, imageB2, imageC2, imageD2, imageE2, imageF2, imageG2, imageH2,
                imageA3, imageB3, imageC3, imageD3, imageE3, imageF3, imageG3, imageH3,
                imageA4, imageB4, imageC4, imageD4, imageE4, imageF4, imageG4, imageH4,
                imageA5, imageB5, imageC5, imageD5, imageE5, imageF5, imageG5, imageH5,
                imageA6, imageB6, imageC6, imageD6, imageE6, imageF6, imageG6, imageH6,
                imageA7, imageB7, imageC7, imageD7, imageE7, imageF7, imageG7, imageH7,
                imageA8, imageB8, imageC8, imageD8, imageE8, imageF8, imageG8, imageH8,
        };


        /**
         * Pièces blanches
         * 1 - Instanciation des pièces blanches
         * 2 - Tableau des pièces blanches
         */
        Piece tourB1 = new Piece("Tour", "blanc", "matthieu/colorfx/png/white_rook.png");
        Piece cavalierB1 = new Piece("Cavalier", "blanc", "matthieu/colorfx/png/white_knight.png");
        Piece fouB1 = new Piece("Fou", "blanc", "matthieu/colorfx/png/white_bishop.png");
        Piece reineB = new Piece("Reine", "blanc", "matthieu/colorfx/png/white_queen.png");
        Piece roiB = new Piece("Roi", "blanc", "matthieu/colorfx/png/white_king.png");
        Piece fouB2 = new Piece("Fou", "blanc", "matthieu/colorfx/png/white_bishop.png");
        Piece cavalierB2 = new Piece("Cavalier", "blanc", "matthieu/colorfx/png/white_knight.png");
        Piece tourB2 = new Piece("Tour", "blanc", "matthieu/colorfx/png/white_rook.png");
        Piece p1B = new Piece("pion1", "blanc", "matthieu/colorfx/png/white_pawn.png");
        Piece p2B = new Piece("pion2", "blanc", "matthieu/colorfx/png/white_pawn.png");
        Piece p3B = new Piece("pon3", "blanc", "matthieu/colorfx/png/white_pawn.png");
        Piece p4B = new Piece("pion4", "blanc", "matthieu/colorfx/png/white_pawn.png");
        Piece p5B = new Piece("pion5", "blanc", "matthieu/colorfx/png/white_pawn.png");
        Piece p6B = new Piece("pion6", "blanc", "matthieu/colorfx/png/white_pawn.png");
        Piece p7B = new Piece("pion7", "blanc", "matthieu/colorfx/png/white_pawn.png");
        Piece p8B = new Piece("pion8", "blanc", "matthieu/colorfx/png/white_pawn.png");

        Piece[] pieceBlanchesArray = {
                tourB1, cavalierB1, fouB1, reineB, roiB, fouB2, cavalierB2, tourB2,
                p1B, p2B, p3B, p4B, p5B, p6B, p7B, p8B
        };

        /**
         * Pièces noires
         * 1 - Instanciation des pièces noires
         * 2 - Tableau des pièces noires
         */
        Piece tourN1 = new Piece("Tour", "noir", "matthieu/colorfx/png/black_rook.png");
        Piece cavalierN1 = new Piece("Cavalier", "noir", "matthieu/colorfx/png/black_knight.png");
        Piece fouN1 = new Piece("Fou", "noir", "matthieu/colorfx/png/black_bishop.png");
        Piece roiN = new Piece("Roi", "noir", "matthieu/colorfx/png/black_king.png");
        Piece reineN = new Piece("Reine", "noir", "matthieu/colorfx/png/black_queen.png");
        Piece fouN2 = new Piece("Fou", "noir", "matthieu/colorfx/png/black_bishop.png");
        Piece cavalierN2 = new Piece("Cavalier", "noir", "matthieu/colorfx/png/black_knight.png");
        Piece tourN2 = new Piece("Tour", "noir", "matthieu/colorfx/png/black_rook.png");
        Piece p1N = new Piece("pion1", "noir", "matthieu/colorfx/png/black_pawn.png");
        Piece p2N = new Piece("pion2", "noir", "matthieu/colorfx/png/black_pawn.png");
        Piece p3N = new Piece("pon3", "noir", "matthieu/colorfx/png/black_pawn.png");
        Piece p4N = new Piece("pion4", "noir", "matthieu/colorfx/png/black_pawn.png");
        Piece p5N = new Piece("pion5", "noir", "matthieu/colorfx/png/black_pawn.png");
        Piece p6N = new Piece("pion6", "noir", "matthieu/colorfx/png/black_pawn.png");
        Piece p7N = new Piece("pion7", "noir", "matthieu/colorfx/png/black_pawn.png");
        Piece p8N = new Piece("pion8", "noir", "matthieu/colorfx/png/black_pawn.png");

        Piece[] pieceNoiresArray = {
                tourN1, cavalierN1, fouN1, roiN, reineN, fouN2, cavalierN2, tourN2,
                p1N, p2N, p3N, p4N, p5N, p6N, p7N, p8N
        };



        /**
         * Debug
         */


        /**
         * Évenement de début de partie
         */
        nouvellePartie.setOnMouseClicked(event -> {
            /**
             * Mise en place des couleurs des cases
             */
            plateauC.backgroundColorPair(0, 7, arrayPane);
            plateauC.backgroundColorImpair(8, 15, arrayPane);
            plateauC.backgroundColorPair(16, 23, arrayPane);
            plateauC.backgroundColorImpair(24, 31, arrayPane);
            plateauC.backgroundColorPair(32, 39, arrayPane);
            plateauC.backgroundColorImpair(40, 47, arrayPane);
            plateauC.backgroundColorPair(48, 55, arrayPane);
            plateauC.backgroundColorImpair(56, 63, arrayPane);

            /**
             * Mise en place des pièces
             */
            for (int i = 0; i < 16; i++) {
                arrayAllImage[i].setImage((new Image(pieceBlanchesArray[i].getImage())));
                arrayAllImage[i].setId(pieceBlanchesArray[i].getImage());


            }

            int j = 0;
            for (int i = 63 ; i > 47; i--) {
                arrayAllImage[i].setImage((new Image(pieceNoiresArray[j].getImage())));
                arrayAllImage[i].setId(pieceNoiresArray[j].getImage());
                j++;
            }

            for (int i = 17; i < 47; i++){
                arrayAllImage[i].setImage(null);
                arrayAllImage[i].setId(null);
            }

        });

        /**
         * Evènement des pièces
         */

        /**
         * Si i entre 0 et 16
         * Si i entre 47 et 63
         */


        /**
         ** click
         */
        for (int i = 0; i < arrayAllImage.length; i++) {
            plateauC.deplacement(i, arrayAllImage);
        }



        /*for (int i = 0; i < arrayAllImage.length; i++) {
            int finalI1 = i;
            while (true) {
                arrayAllImage[i].setOnMouseClicked(event -> {
                    AtomicReference<String> imageStock = new AtomicReference<>(pieceBlanchesArray[finalI1].getImage());

                    for (int j = 0; j < arrayAllImage.length; j++) {
                        int finalI = j;
                        arrayAllImage[j].setOnMouseClicked(e -> {
                            arrayAllImage[finalI].setImage(new Image(String.valueOf(imageStock)));
                            arrayAllImage[finalI1].setImage(null);
                            imageStock.set(null);
                        });
                    }
                });
                break;
            }
        }*/





        /*for (int i = 0; i < arrayAllImage.length; i++) {
            System.out.println(i);

            int finalI = i;
            arrayAllImage[i].setOnMouseClicked(event -> {

                //System.out.println(arrayAllImage[finalI]);
                if (finalI >= 0 && finalI < 16) {
                    arrayAllImage[finalI].getParent().setStyle("-fx-background-color: pink");
                    imageStock = pieceBlanchesArray[finalI].getImage();
                    secondClick = true;

                }


                //System.out.println(event.get);

                /*if (finalI >= 0 && finalI < 16) {

                }
               System.out.println(finalI);
                System.out.println(pieceBlanchesArray[finalI].getImage());
            });
        }

        /**
         * Second click
         */
        /* if (secondClick){
            for (int i = 0; i < arrayAllImage.length; i++) {
                System.out.println(i);

                int finalI = i;
                arrayAllImage[i].setOnMouseClicked(event -> {
                    arrayAllImage[finalI].setImage(new Image(imageStock));
                });
            }
        } **/




        /**
         * Évenement d'annulation de coup
         */

        /**
         * Évenement quitter la partie
         */





    }
}
