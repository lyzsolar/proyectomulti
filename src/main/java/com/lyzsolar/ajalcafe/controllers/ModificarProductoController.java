package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ModificarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField idText;

    @FXML
    private TextField nombreText;

    @FXML
    private TextField categoriaText;

    @FXML
    private TextField caducidadText;

    @FXML
    private TextField cantidadText;

    @FXML
    private TextField unidadText;

    @FXML
    private TextField precioText;

    @FXML
    private Button guardarbutton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView guardarIcono;

    @FXML
    private ImageView regresarIcono;

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedGuardarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert idText != null : "fx:id=\"idText\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";
        assert nombreText != null : "fx:id=\"nombreText\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";
        assert categoriaText != null : "fx:id=\"categoriaText\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";
        assert caducidadText != null : "fx:id=\"caducidadText\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";
        assert cantidadText != null : "fx:id=\"cantidadText\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";
        assert unidadText != null : "fx:id=\"unidadText\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";
        assert precioText != null : "fx:id=\"precioText\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";
        assert guardarbutton != null : "fx:id=\"guardarbutton\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";
        assert guardarIcono != null : "fx:id=\"guardarIcono\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'ModificarProducto-view.fxml'.";

    }
}
