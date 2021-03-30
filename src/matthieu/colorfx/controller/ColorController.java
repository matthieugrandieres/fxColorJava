package matthieu.colorfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import matthieu.colorfx.modele.Color;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Math.round;

public class ColorController implements Initializable {

    private Color color;

    @FXML
    private TextField textFieldRed;

    @FXML
    private TextField textFieldGreen;

    @FXML
    private TextField textFieldBlue;

    @FXML
    private Slider rangeFieldRed;

    @FXML
    private Slider rangeFieldGreen;

    @FXML
    private Slider rangeFieldBlue;

    @FXML
    private Pane background;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        /**
         * Event change red
         */
        textFieldRed.textProperty().addListener(event -> {

            int red = Integer.parseInt(textFieldRed.getText());
            int green = Integer.parseInt(textFieldGreen.getText());
            int blue = Integer.parseInt(textFieldBlue.getText());

            rangeFieldRed.setValue(red);

            if (red < 0 || textFieldRed.getText().length() == 0) {
                red = 0;
                textFieldRed.setText("0");
            } else if (red > 255) {
                textFieldRed.setText("255");
                red = 255;
            }

            color = new Color(red, green, blue);
            background.setStyle(color.getFxBackgroundColor());

            System.out.println(color.getRed() + " " + color.getGreen() + " " + color.getBlue() + " " );
        });

        /**
         * Event change green
         */
        textFieldGreen.textProperty().addListener(event -> {

            int red = Integer.parseInt(textFieldRed.getText());
            int green = Integer.parseInt(textFieldGreen.getText());
            int blue = Integer.parseInt(textFieldBlue.getText());

            rangeFieldGreen.setValue(green);

            if (green < 0) {
                green = 0;
            } else if (green > 255) {
                textFieldGreen.setText("255");
                green = 255;

            }

            color = new Color(red, green, blue);
            background.setStyle(color.getFxBackgroundColor());

            System.out.println(color.getRed() + " " + color.getGreen() + " " + color.getBlue() + " " );
        });

        /**
         * Event change blue
         */
        textFieldBlue.textProperty().addListener(event -> {

            int red = Integer.parseInt(textFieldRed.getText());
            int green = Integer.parseInt(textFieldGreen.getText());
            int blue = Integer.parseInt(textFieldBlue.getText());

            rangeFieldBlue.setValue(blue);

            if (blue <  0) {
                blue = 0;
            } else if (blue > 255) {
                blue = 255;
                textFieldBlue.setText("255");
            }

            color = new Color(red, green, blue);
            background.setStyle(color.getFxBackgroundColor());

            System.out.println(color.getRed() + " " + color.getGreen() + " " + color.getBlue() + " " );
        });

        /**
         * Event change slider red
         */
        rangeFieldRed.valueProperty().addListener(event->{
            textFieldRed.setText(String.valueOf(round(rangeFieldRed.getValue())));
        });

        /**
         * Event change slider green
         */
        rangeFieldGreen.valueProperty().addListener(event->{
            textFieldGreen.setText(String.valueOf(round(rangeFieldGreen.getValue())));
        });

        /**
         * Event change slider blue
         */
        rangeFieldBlue.valueProperty().addListener(event->{
            textFieldBlue.setText(String.valueOf(round(rangeFieldBlue.getValue())));
        });

    }
}
