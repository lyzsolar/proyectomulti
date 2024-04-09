package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class verVentaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> IDDataTable;

    @FXML
    private Button RegresarButton;

    @FXML
    private TableView<?> TableVerProductos;

    @FXML
    private TableColumn<?, ?> fechaDataTable;

    @FXML
    private TableColumn<?, ?> montototalDataTable;

    @FXML
    private ImageView regresarIcono;

    @FXML
    void OnMouseClickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseClickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert IDDataTable != null : "fx:id=\"IDDataTable\" was not injected: check your FXML file 'VerVenta-view.fxml'.";
        assert RegresarButton != null : "fx:id=\"RegresarButton\" was not injected: check your FXML file 'VerVenta-view.fxml'.";
        assert TableVerProductos != null : "fx:id=\"TableVerProductos\" was not injected: check your FXML file 'VerVenta-view.fxml'.";
        assert fechaDataTable != null : "fx:id=\"fechaDataTable\" was not injected: check your FXML file 'VerVenta-view.fxml'.";
        assert montototalDataTable != null : "fx:id=\"montototalDataTable\" was not injected: check your FXML file 'VerVenta-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'VerVenta-view.fxml'.";

    }

}
