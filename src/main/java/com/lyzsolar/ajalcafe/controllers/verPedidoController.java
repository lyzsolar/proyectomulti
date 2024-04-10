package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class verPedidoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> IDDataTable;

    @FXML
    private TableView<?> TableVerProductos;

    @FXML
    private TableColumn<?, ?> caducidadDataTable;

    @FXML
    private TableColumn<?, ?> cantidadDataTable;

    @FXML
    private TableColumn<?, ?> categoriaDataTable;

    @FXML
    private TableColumn<?, ?> nombreDataTable;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TableColumn<?, ?> unidadDataTable;

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert IDDataTable != null : "fx:id=\"IDDataTable\" was not injected: check your FXML file 'VerPedido-view.fxml'.";
        assert TableVerProductos != null : "fx:id=\"TableVerProductos\" was not injected: check your FXML file 'VerPedido-view.fxml'.";
        assert caducidadDataTable != null : "fx:id=\"caducidadDataTable\" was not injected: check your FXML file 'VerPedido-view.fxml'.";
        assert cantidadDataTable != null : "fx:id=\"cantidadDataTable\" was not injected: check your FXML file 'VerPedido-view.fxml'.";
        assert categoriaDataTable != null : "fx:id=\"categoriaDataTable\" was not injected: check your FXML file 'VerPedido-view.fxml'.";
        assert nombreDataTable != null : "fx:id=\"nombreDataTable\" was not injected: check your FXML file 'VerPedido-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'VerPedido-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'VerPedido-view.fxml'.";
        assert unidadDataTable != null : "fx:id=\"unidadDataTable\" was not injected: check your FXML file 'VerPedido-view.fxml'.";

    }

}

