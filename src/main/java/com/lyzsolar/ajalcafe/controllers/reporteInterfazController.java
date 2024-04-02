package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class reporteInterfazController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cerrarButton2;

    @FXML
    private Button generarReporteButton;

    @FXML
    private Button regresarButton;

    @FXML
    void OnMouseclickedCerrarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedGenerarReporteButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert cerrarButton2 != null : "fx:id=\"cerrarButton2\" was not injected: check your FXML file 'ReporteInterfaz-view.fxml'.";
        assert generarReporteButton != null : "fx:id=\"generarReporteButton\" was not injected: check your FXML file 'ReporteInterfaz-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'ReporteInterfaz-view.fxml'.";

    }

}
