package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button IngresarButton;

    @FXML
    private TextField contraseñaTxt;

    @FXML
    private ComboBox<?> usuarioCombobox;

    @FXML
    void ingresar_App(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert IngresarButton != null : "fx:id=\"IngresarButton\" was not injected: check your FXML file 'login-view.fxml'.";
        assert contraseñaTxt != null : "fx:id=\"contraseñaTxt\" was not injected: check your FXML file 'login-view.fxml'.";
        assert usuarioCombobox != null : "fx:id=\"usuarioCombobox\" was not injected: check your FXML file 'login-view.fxml'.";

    }

}

