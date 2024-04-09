package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class agregarPedidoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField AgregarProductText;

    @FXML
    private Button VistaCartaButton;

    @FXML
    private ImageView VistaCartaIcono;

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
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TextField subtotalText;

    @FXML
    private TextField totalText;

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
    void OnMouseclickedVistaCartaButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedVistaCartaIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert AgregarProductText != null : "fx:id=\"AgregarProductText\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert VistaCartaButton != null : "fx:id=\"VistaCartaButton\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert VistaCartaIcono != null : "fx:id=\"VistaCartaIcono\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert fechaText != null : "fx:id=\"fechaText\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert guardarIcono != null : "fx:id=\"guardarIcono\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert guardarbutton != null : "fx:id=\"guardarbutton\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert idText != null : "fx:id=\"idText\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert nomClienteText != null : "fx:id=\"nomClienteText\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert subtotalText != null : "fx:id=\"subtotalText\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";
        assert totalText != null : "fx:id=\"totalText\" was not injected: check your FXML file 'AgregarPedido-view.fxml'.";

    }

}
