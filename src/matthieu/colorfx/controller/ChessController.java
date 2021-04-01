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

import javax.xml.bind.SchemaOutputResolver;
import java.net.URL;
import java.util.ResourceBundle;

public class ChessController implements Initializable {

    private Plateau plateauC;


    @FXML
    private Button buttonAnnuler;

    @FXML
    private Button nouvellePartie;

    @FXML
    private Button quitter;

    @FXML
    private GridPane plateau;

    /*@FXML
    private ImageView imageA1, imageA2, imageA3, imageA4, imageA5, imageA6, imageA7, imageA8;*/

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

        /*ImageView[] arrayImage = {
                imageA1, imageA2, imageA3, imageA4, imageA5, imageA6, imageA7, imageA8
        };*/

        /**
         * Pièces blanches
         * 1 - Instanciation des pièces
         * 2 - Tableau des pièces
         */
        Piece tourB1 = new Piece("Tour", "blanc", "matthieu/colorfx/png/white_rook.png");
        Piece cavalierB1 = new Piece("Cavalier", "blanc", "matthieu/colorfx/png/white_knight.png");
        Piece fouB1 = new Piece("Fou", "blanc", "matthieu/colorfx/png/white_bishop.png");
        Piece reineB = new Piece("Reine", "blanc", "matthieu/colorfx/png/white_queen.png");
        Piece roiB = new Piece("Roi", "blanc", "matthieu/colorfx/png/white_king.png");
        Piece tourB2 = new Piece("Tour", "blanc", "matthieu/colorfx/png/white_rook.png");
        Piece cavalierB2 = new Piece("Cavalier", "blanc", "matthieu/colorfx/png/white_knight.png");
        Piece fouB2 = new Piece("Fou", "blanc", "matthieu/colorfx/png/white_bishop.png");

        Piece[] pieceBlanchesArray = {
                tourB1, cavalierB1, fouB1, reineB, roiB, tourB2, cavalierB2, fouB2,
        };

        //plateauC.setPiecesBlanches(pieceBlanchesArray);



        /**
         * Pièce noires
         */

        /**
         * Image
         */
        //imageA1.setImage(new Image("matthieu/colorfx/png/black_bishop.png"));


        /**
         * Background
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

            //arrayImage[1].setImage(new Image(String.valueOf(pieceBlanchesArray[1])));

        });

        /**
         * Évenement d'annulation de coup
         */

        /**
         * Évenement quitter la partie
         */




    }
}
