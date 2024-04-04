package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class verProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Producto> DataTable;

    @FXML
    private TableColumn<Producto, Integer> IDDataTable;

    @FXML
    private TableColumn<Producto, LocalDate> caducidadDataTable;

    @FXML
    private TableColumn<Producto, Integer> cantidadDataTable;

    @FXML
    private TableColumn<Producto, String> categoriaDataTable;

    @FXML
    private TableColumn<Producto, String> nombreDataTable;

    @FXML
    private TableColumn<Producto, Double> precioDataTable;

    @FXML
    private TableColumn<Producto, String> unidadDataTable;

    @FXML
    void initialize() {
        assert DataTable != null : "fx:id=\"DataTable\" was not injected: check your FXML file 'VerProducto-view.fxml'.";
        assert IDDataTable != null : "fx:id=\"IDDataTable\" was not injected: check your FXML file 'VerProducto-view.fxml'.";
        assert caducidadDataTable != null : "fx:id=\"caducidadDataTable\" was not injected: check your FXML file 'VerProducto-view.fxml'.";
        assert cantidadDataTable != null : "fx:id=\"cantidadDataTable\" was not injected: check your FXML file 'VerProducto-view.fxml'.";
        assert categoriaDataTable != null : "fx:id=\"categoriaDataTable\" was not injected: check your FXML file 'VerProducto-view.fxml'.";
        assert nombreDataTable != null : "fx:id=\"nombreDataTable\" was not injected: check your FXML file 'VerProducto-view.fxml'.";
        assert precioDataTable != null : "fx:id=\"precioDataTable\" was not injected: check your FXML file 'VerProducto-view.fxml'.";
        assert unidadDataTable != null : "fx:id=\"unidadDataTable\" was not injected: check your FXML file 'VerProducto-view.fxml'.";

    }

}

