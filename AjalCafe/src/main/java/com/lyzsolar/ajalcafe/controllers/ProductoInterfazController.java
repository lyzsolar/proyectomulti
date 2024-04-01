package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ProductoInterfazController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agregarButton;

    @FXML
    private Button modificarButton;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button verButton;

    @FXML
    private Button regresarButton;

    @FXML
    void OnMouseclickedAgregarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedModificarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedVerButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert agregarButton != null : "fx:id=\"agregarButton\" was not injected: check your FXML file 'ProductoInterfaz-view.fxml'.";
        assert modificarButton != null : "fx:id=\"modificarButton\" was not injected: check your FXML file 'ProductoInterfaz-view.fxml'.";
        assert eliminarButton != null : "fx:id=\"eliminarButton\" was not injected: check your FXML file 'ProductoInterfaz-view.fxml'.";
        assert verButton != null : "fx:id=\"verButton\" was not injected: check your FXML file 'ProductoInterfaz-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'ProductoInterfaz-view.fxml'.";

    }
}
