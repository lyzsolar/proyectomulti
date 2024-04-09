package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class eliminarPedidoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BuscarButton;

    @FXML
    private TextField NombreText;

    @FXML
    private ImageView buscarIcono;

    @FXML
    private Button eliminarButton;

    @FXML
    private ImageView eliminarIcono;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    void OnMouseclickedBuscarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedBuscarIcono(MouseEvent event) {

    }

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
    void initialize() {
        assert BuscarButton != null : "fx:id=\"BuscarButton\" was not injected: check your FXML file 'EliminarPedido-view.fxml'.";
        assert NombreText != null : "fx:id=\"NombreText\" was not injected: check your FXML file 'EliminarPedido-view.fxml'.";
        assert buscarIcono != null : "fx:id=\"buscarIcono\" was not injected: check your FXML file 'EliminarPedido-view.fxml'.";
        assert eliminarButton != null : "fx:id=\"eliminarButton\" was not injected: check your FXML file 'EliminarPedido-view.fxml'.";
        assert eliminarIcono != null : "fx:id=\"eliminarIcono\" was not injected: check your FXML file 'EliminarPedido-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'EliminarPedido-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'EliminarPedido-view.fxml'.";

    }

}

