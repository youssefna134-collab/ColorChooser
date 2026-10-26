package com.mycompany.colorchooser;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorChooserController {

    @FXML
    private Slider redSlider;
    @FXML
    private Slider alphaSlider;
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider greenSlider;
    @FXML
    private TextField redTextField;
    @FXML
    private TextField alphaTextField;
    @FXML
    private TextField blueTextField;
    @FXML
    private TextField greenTextField;
    @FXML
    private Rectangle colorRectangle;
    
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
   
    
    public void initialize() {
        redSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            red = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, blue, green, alpha));
        });
        
        greenSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            green = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, blue, green, alpha));
        });
        
        blueSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            blue = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, blue, green, alpha));
        });
        
        alphaSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            alpha = newValue.doubleValue();
            colorRectangle.setFill(Color.rgb(red, blue, green, alpha));
        });
        
        redTextField.textProperty().bind(redSlider.valueProperty()
            .asString("%.0f"));
        
        greenTextField.textProperty().bind(greenSlider.valueProperty()
            .asString("%.0f"));
        
        blueTextField.textProperty().bind(blueSlider.valueProperty()
            .asString("%.0f"));
        
        alphaTextField.textProperty().bind(alphaSlider.valueProperty()
            .asString("%.0f"));
    }
}
