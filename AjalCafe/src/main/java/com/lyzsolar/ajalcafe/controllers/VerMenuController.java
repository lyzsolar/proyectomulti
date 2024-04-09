package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class VerMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> TableVerProductos;

    @FXML
    private TableColumn<?, ?> IDDataTable;

    @FXML
    private TableColumn<?, ?> nombreDataTable;

    @FXML
    private TableColumn<?, ?> descripcionDataTable;

    @FXML
    private TableColumn<?, ?> precioDataTable;

    @FXML
    private Button RegresarButton;

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
        assert TableVerProductos != null : "fx:id=\"TableVerProductos\" was not injected: check your FXML file 'VerMenu-view.fxml'.";
        assert IDDataTable != null : "fx:id=\"IDDataTable\" was not injected: check your FXML file 'VerMenu-view.fxml'.";
        assert nombreDataTable != null : "fx:id=\"nombreDataTable\" was not injected: check your FXML file 'VerMenu-view.fxml'.";
        assert descripcionDataTable != null : "fx:id=\"descripcionDataTable\" was not injected: check your FXML file 'VerMenu-view.fxml'.";
        assert precioDataTable != null : "fx:id=\"precioDataTable\" was not injected: check your FXML file 'VerMenu-view.fxml'.";
        assert RegresarButton != null : "fx:id=\"RegresarButton\" was not injected: check your FXML file 'VerMenu-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'VerMenu-view.fxml'.";

    }
}
