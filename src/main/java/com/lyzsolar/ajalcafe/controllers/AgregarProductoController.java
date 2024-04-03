package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AgregarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button guardarbutton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView guardarIcono;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TextField idProducto;

    @FXML
    private TextField nombreProducto;

    @FXML
    private TextField tipoProducto;

    @FXML
    private TextField caducidadProducto;

    @FXML
    private TextField cantidadProducto;

    @FXML
    private TextField precioProducto;
    @FXML
    private TextField unidadProducto;

    Stage vistaProducto = new Stage();

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {

    }


    @FXML
    void OnMouseclickedGuardarIcono(MouseEvent event) {

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
        void OnMouseclickedRegresarIcono (MouseEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoInterfaz-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            vistaProducto.setTitle("Menú Producto");
            vistaProducto.setScene(scene);
            vistaProducto.show();
            Stage stage = (Stage) regresarIcono.getScene().getWindow();
            stage.close();

        }
    @FXML
    void initialize() {
        assert guardarbutton != null : "fx:id=\"guardarbutton\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";
        assert guardarIcono != null : "fx:id=\"guardarIcono\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";
        assert idProducto != null : "fx:id=\"idProducto\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";
        assert nombreProducto != null : "fx:id=\"nombreProducto\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";
        assert tipoProducto != null : "fx:id=\"tipoProducto\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";
        assert caducidadProducto != null : "fx:id=\"caducidadProducto\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";
        assert cantidadProducto != null : "fx:id=\"cantidadProducto\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";
        assert precioProducto != null : "fx:id=\"precioProducto\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";
        assert unidadProducto != null : "fx:id=\"unidadProducto\" was not injected: check your FXML file 'AgregarProducto-view.fxml'.";

    }
}



