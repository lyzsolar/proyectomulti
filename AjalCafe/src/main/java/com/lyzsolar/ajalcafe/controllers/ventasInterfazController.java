package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ventasInterfazController {

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
    private ImageView back;

    @FXML
    void OnMouseclickedAgregarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedBackButton(MouseEvent event) {

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
        assert agregarButton != null : "fx:id=\"agregarButton\" was not injected: check your FXML file 'VentasInterfaz-view.fxml'.";
        assert modificarButton != null : "fx:id=\"modificarButton\" was not injected: check your FXML file 'VentasInterfaz-view.fxml'.";
        assert eliminarButton != null : "fx:id=\"eliminarButton\" was not injected: check your FXML file 'VentasInterfaz-view.fxml'.";
        assert verButton != null : "fx:id=\"verButton\" was not injected: check your FXML file 'VentasInterfaz-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'VentasInterfaz-view.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'VentasInterfaz-view.fxml'.";

    }
}
