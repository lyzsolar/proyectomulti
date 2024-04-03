package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class InterfazPruebaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Prueba;

    @FXML
    void OnMousePrueba(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert Prueba != null : "fx:id=\"Prueba\" was not injected: check your FXML file 'interfaz-view-prueba.fxml'.";

    }

}
