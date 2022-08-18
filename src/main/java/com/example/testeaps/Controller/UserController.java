package com.example.testeaps.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserController {

    @FXML
    private Label welcomeText;

    @FXML
    public void onUserHandler (){
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}
