package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class homeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button IngresarButton;

    @FXML
    private PasswordField password;

    @FXML
    private TextField user;

    @FXML
    void OnMouseclickedIngresarButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert IngresarButton != null : "fx:id=\"IngresarButton\" was not injected: check your FXML file 'Home-view.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'Home-view.fxml'.";
        assert user != null : "fx:id=\"user\" was not injected: check your FXML file 'Home-view.fxml'.";

    }
}
