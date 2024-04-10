package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PedidoVendedorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agregarButton;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button modificarButton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private Button verButton;

    Stage vistaMenuVendedor = new Stage();
    Stage AddPedido = new Stage();
    Stage DeletePedido = new Stage();
    Stage VerPedidos = new Stage();

    @FXML
    void OnMouseclickedAgregarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarPedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        AddPedido.setTitle("Agregar Pedido");
        AddPedido.setScene(scene);
        AddPedido.show();
        Stage stage = (Stage) agregarButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("EliminarPedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        DeletePedido.setTitle("Agregar Pedido");
        DeletePedido.setScene(scene);
        DeletePedido.show();
        Stage stage = (Stage) eliminarButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedModificarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ModificarPedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        DeletePedido.setTitle("Agregar Pedido");
        DeletePedido.setScene(scene);
        DeletePedido.show();
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Vendedor_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuVendedor.setTitle("Menu Vendedor");
        vistaMenuVendedor.setScene(scene);
        vistaMenuVendedor.show();
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Vendedor_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuVendedor.setTitle("Menu Vendedor");
        vistaMenuVendedor.setScene(scene);
        vistaMenuVendedor.show();
        Stage stage = (Stage) regresarIcono.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedVerButton(MouseEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VerPedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        VerPedidos.setTitle("Ver Productos");
        VerPedidos.setScene(scene);
        VerPedidos.show();
        Stage stage = (Stage) verButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void initialize() {
        assert agregarButton != null : "fx:id=\"agregarButton\" was not injected: check your FXML file 'PedidoVendedor-view.fxml'.";
        assert eliminarButton != null : "fx:id=\"eliminarButton\" was not injected: check your FXML file 'PedidoVendedor-view.fxml'.";
        assert modificarButton != null : "fx:id=\"modificarButton\" was not injected: check your FXML file 'PedidoVendedor-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'PedidoVendedor-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'PedidoVendedor-view.fxml'.";
        assert verButton != null : "fx:id=\"verButton\" was not injected: check your FXML file 'PedidoVendedor-view.fxml'.";

    }

}
