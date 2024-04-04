package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class EliminarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView eliminarIcono;

    @FXML
    private TextField idText;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button verButton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView verIcono;

    @FXML
    private ImageView regresarIcono;

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedEliminarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedVerButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedVerIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert eliminarIcono != null : "fx:id=\"eliminarIcono\" was not injected: check your FXML file 'EliminarProducto-view.fxml'.";
        assert idText != null : "fx:id=\"idText\" was not injected: check your FXML file 'EliminarProducto-view.fxml'.";
        assert eliminarButton != null : "fx:id=\"eliminarButton\" was not injected: check your FXML file 'EliminarProducto-view.fxml'.";
        assert verButton != null : "fx:id=\"verButton\" was not injected: check your FXML file 'EliminarProducto-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'EliminarProducto-view.fxml'.";
        assert verIcono != null : "fx:id=\"verIcono\" was not injected: check your FXML file 'EliminarProducto-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'EliminarProducto-view.fxml'.";

    }
}
