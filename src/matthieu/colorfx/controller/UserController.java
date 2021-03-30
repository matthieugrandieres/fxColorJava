package matthieu.colorfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import matthieu.colorfx.modele.User;

import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {

    private User user;

    @FXML
    private TextField textFieldPrenom;

    @FXML
    private TextField textFieldNom;

    @FXML
    private Button buttonSubmit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttonSubmit.setOnMouseClicked(mouseEvent -> {
            String prenom = textFieldPrenom.getText();
            String nom = textFieldNom.getText();

            user = new User(prenom, nom);

            System.out.println(user.getPrenom() + " " + user.getNom());
        });
    }
}
