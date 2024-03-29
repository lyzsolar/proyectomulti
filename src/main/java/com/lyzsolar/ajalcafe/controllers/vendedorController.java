package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class vendedorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cerrarButton;

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
    void OnMouseclickedCerrarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedMenuButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedPedidoButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedProductoButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedReporteButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedVentasButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert cerrarButton != null : "fx:id=\"cerrarButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";
        assert menuButton != null : "fx:id=\"menuButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";
        assert pedidoButton != null : "fx:id=\"pedidoButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";
        assert productoButton != null : "fx:id=\"productoButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";
        assert reporteButton != null : "fx:id=\"reporteButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";
        assert ventaButton != null : "fx:id=\"ventaButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";

    }

}


