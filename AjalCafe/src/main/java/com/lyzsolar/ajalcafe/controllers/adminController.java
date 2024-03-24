package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class adminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button menuButton;

    @FXML
    private Button pedidoButton;

    @FXML
    private Button productoButton;

    @FXML
    private Button reporteButton;

    @FXML
    private Button ventaButton;

    @FXML
    void abirMenu(ActionEvent event) {

    }

    @FXML
    void abiriPedido(ActionEvent event) {

    }

    @FXML
    void abiriReporte(ActionEvent event) {

    }

    @FXML
    void abrirProducto(ActionEvent event) {

    }

    @FXML
    void abrirVenta(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert menuButton != null : "fx:id=\"menuButton\" was not injected: check your FXML file 'Admin-view.fxml'.";
        assert pedidoButton != null : "fx:id=\"pedidoButton\" was not injected: check your FXML file 'Admin-view.fxml'.";
        assert productoButton != null : "fx:id=\"productoButton\" was not injected: check your FXML file 'Admin-view.fxml'.";
        assert reporteButton != null : "fx:id=\"reporteButton\" was not injected: check your FXML file 'Admin-view.fxml'.";
        assert ventaButton != null : "fx:id=\"ventaButton\" was not injected: check your FXML file 'Admin-view.fxml'.";

    }

}
