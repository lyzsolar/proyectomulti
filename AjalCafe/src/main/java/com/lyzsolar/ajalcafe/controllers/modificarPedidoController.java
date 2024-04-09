package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class modificarPedidoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView buscarIcono;

    @FXML
    private Button buscarrButton;

    @FXML
    private TextField fechaText;

    @FXML
    private ImageView guardarIcono;

    @FXML
    private Button guardarbutton;

    @FXML
    private TextField idText;

    @FXML
    private TextField nomClienteText;

    @FXML
    private TextField productoText;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TextField subtotalText;

    @FXML
    private TextField totalText;

    @FXML
    void OnMouseclickedBuscarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedBuscarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedGuardarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert buscarIcono != null : "fx:id=\"buscarIcono\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert buscarrButton != null : "fx:id=\"buscarrButton\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert fechaText != null : "fx:id=\"fechaText\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert guardarIcono != null : "fx:id=\"guardarIcono\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert guardarbutton != null : "fx:id=\"guardarbutton\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert idText != null : "fx:id=\"idText\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert nomClienteText != null : "fx:id=\"nomClienteText\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert productoText != null : "fx:id=\"productoText\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert subtotalText != null : "fx:id=\"subtotalText\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";
        assert totalText != null : "fx:id=\"totalText\" was not injected: check your FXML file 'ModificarPedido-view.fxml'.";

    }

}

