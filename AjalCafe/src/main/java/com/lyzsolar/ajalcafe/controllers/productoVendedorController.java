package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class productoVendedorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private Button verProductosButton;

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) {

    }


    @FXML
    void OnMouseclickedVerProductosButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'ProductoVendedor-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'ProductoVendedor-view.fxml'.";
        assert verProductosButton != null : "fx:id=\"verProductosButton\" was not injected: check your FXML file 'ProductoVendedor-view.fxml'.";

    }

}
