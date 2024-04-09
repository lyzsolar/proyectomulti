package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.models.Gerencia;
import com.lyzsolar.ajalcafe.models.Producto;

import com.lyzsolar.ajalcafe.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static com.lyzsolar.ajalcafe.models.Gerencia.insumos;

public class AgregarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agregarbutton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView agregarIcono;

    @FXML
    private ImageView regresarIcono;

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
    private TextField precioText;
    @FXML
    private TextField unidadText;

    Stage vistaProducto = new Stage();




    private ObservableList<Producto> insumos = FXCollections.observableArrayList();

    @FXML
    void OnMouseclickedAgregarButton(MouseEvent event) {
        try {
            Integer idProducto = Integer.valueOf(idText.getText());
            String nombreProducto = nombreText.getText();
            String categoria = categoriaText.getText();
            LocalDate fechacaducidad = LocalDate.parse(caducidadText.getText());
            Integer cantidadProducto = Integer.valueOf(cantidadText.getText());
            String unidad = unidadText.getText();
            double precioProducto = Double.parseDouble(precioText.getText());

            Producto nuevoProducto = new Producto(idProducto, nombreProducto, categoria, fechacaducidad, cantidadProducto, unidad, precioProducto);
            Gerencia.addProducto(nuevoProducto);

            idText.clear();
            nombreText.clear();
            categoriaText.clear();
            caducidadText.clear();
            cantidadText.clear();
            unidadText.clear();
            precioText.clear();

        } catch (DateTimeParseException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Formato de fecha incorrecto");
            alert.setContentText("Ingrese cuatro digitos para el año, dos para\n el mes y dos para el dia");
            alert.showAndWait();
        }


    }

    @FXML
    void OnMouseclickedAgregarIcono(MouseEvent event) {

        try {
            Integer idProducto = Integer.valueOf(idText.getText());
            String nombreProducto = nombreText.getText();
            String categoria = categoriaText.getText();
            LocalDate fechacaducidad = LocalDate.parse(caducidadText.getText());
            Integer cantidadProducto = Integer.valueOf(cantidadText.getText());
            String unidad = unidadText.getText();
            double precioProducto = Double.parseDouble(precioText.getText());

            Producto nuevoProducto = new Producto(idProducto, nombreProducto, categoria, fechacaducidad, cantidadProducto, unidad, precioProducto);
            Gerencia.addProducto(nuevoProducto);

            idText.clear();
            nombreText.clear();
            categoriaText.clear();
            caducidadText.clear();
            cantidadText.clear();
            unidadText.clear();
            precioText.clear();

        } catch (DateTimeParseException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Formato de fecha incorrecto");
            alert.setContentText("Ingrese cuatro digitos para el año, dos para el mes y dos para el dia");
            alert.showAndWait();
        }

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProducto.setTitle("Menú Producto");
        vistaProducto.setScene(scene);
        vistaProducto.show();
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProducto.setTitle("Menú Producto");
        vistaProducto.setScene(scene);
        vistaProducto.show();
        Stage stage = (Stage) regresarIcono.getScene().getWindow();
        stage.close();

    }
}


