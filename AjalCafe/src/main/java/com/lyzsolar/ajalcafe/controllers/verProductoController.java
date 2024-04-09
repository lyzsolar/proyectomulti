package com.lyzsolar.ajalcafe.controllers;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Empleado;
import com.lyzsolar.ajalcafe.models.Gerencia;
import com.lyzsolar.ajalcafe.models.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;

public class verProductoController {

    @FXML
    private TableView<String> tablaProducto;

    @FXML
    private TableColumn<Gerencia, Integer> IDtablaProductos;

    @FXML
    private TableColumn<Gerencia, String> nametablaProductos;

    @FXML
    private TableColumn<Gerencia, String> categoriatablaProductos;

    @FXML
    private TableColumn<Gerencia, LocalDate> caducidadtablaProductos;

    @FXML
    private TableColumn<Gerencia, Integer> cantidadtablaProductos;

    @FXML
    private TableColumn<Gerencia, String> unidadtablaProductos;

    @FXML
    private TableColumn<Gerencia, Double> preciotablaProductos;

    @FXML
    private Button cerrar;

    @FXML
    private Button regresar;

    @FXML
    private Button verbutton;
    private ObservableList<Gerencia> insumos = FXCollections.observableArrayList();

    @FXML
    void OnMouseclickedCerrarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedVerButton(MouseEvent event) {

    }


    @FXML
    void initialize() {

        // Configuración de las columnas de la tabla usando PropertyValueFactory
        IDtablaProductos.setCellValueFactory(new PropertyValueFactory<>("idProducto"));
        nametablaProductos.setCellValueFactory(new PropertyValueFactory<>("nombreProducto"));
        categoriatablaProductos.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        caducidadtablaProductos.setCellValueFactory(new PropertyValueFactory<>("fechacaducidad"));
        cantidadtablaProductos.setCellValueFactory(new PropertyValueFactory<>("cantidadProducto"));
        unidadtablaProductos.setCellValueFactory(new PropertyValueFactory<>("unidad"));
        preciotablaProductos.setCellValueFactory(new PropertyValueFactory<>("precioProducto"));
        tablaProducto.setItems(tablaProducto.getItems());
    }

    private void cargarListaProductos() {
    }
}

