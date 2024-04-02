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

public class vendedorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cerrarButton;

    @FXML
    private ImageView cerrarIcono;

    @FXML
    private Button menuButton;

    @FXML
    private Button pedidoButton;

    @FXML
    private Button productoButton;

    @FXML
    private Button ventaButton;

    Stage producto = new Stage();
    Stage menu = new Stage();
    Stage pedido = new Stage();
    Stage venta = new Stage();

    @FXML
    void OnMouseclickedCerrarButton(MouseEvent event) {
        Stage stage = (Stage) cerrarButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedCerrarIcono(MouseEvent event) {
        Stage stage = (Stage) cerrarIcono.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedMenuButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MenuVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        menu.setTitle("Menú-Vendedor");
        menu.setScene(scene);
        menu.show();

    }

    @FXML
    void OnMouseclickedPedidoButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("PedidoVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        pedido.setTitle("Pedido-Vendedor");
        pedido.setScene(scene);
        pedido.show();


    }

    @FXML
    void OnMouseclickedProductoButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        producto.setTitle("Producto-Vendedor");
        producto.setScene(scene);
        producto.show();
    }

    @FXML
    void OnMouseclickedVentasButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VentasVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        venta.setTitle("Ventas-Vendedor");
        venta.setScene(scene);
        venta.show();

    }

    @FXML
    void initialize() {
        assert cerrarButton != null : "fx:id=\"cerrarButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";
        assert cerrarIcono != null : "fx:id=\"cerrarIcono\" was not injected: check your FXML file 'Vendedor_view.fxml'.";
        assert menuButton != null : "fx:id=\"menuButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";
        assert pedidoButton != null : "fx:id=\"pedidoButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";
        assert productoButton != null : "fx:id=\"productoButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";
        assert ventaButton != null : "fx:id=\"ventaButton\" was not injected: check your FXML file 'Vendedor_view.fxml'.";

    }

}
