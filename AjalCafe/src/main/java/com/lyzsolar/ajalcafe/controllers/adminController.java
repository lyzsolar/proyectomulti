package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Producto;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class adminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button productoButton;

    @FXML
    private Button menuButton;

    @FXML
    private Button pedidoButton;

    @FXML
    private Button ventaButton;

    @FXML
    private Button reporteButton;

    @FXML
    private Button cerrarButton;

    Stage producto = new Stage();
    Stage pedido = new Stage();
    Stage menu = new Stage();
    Stage venta = new Stage();
    Stage reporte = new Stage();

    @FXML
    void OnMouseclickedCerrarButton(MouseEvent event) {
        Stage stage = (Stage) cerrarButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedMenuButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MenuInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        menu.setTitle("Menú");
        menu.setScene(scene);
        menu.show();

    }

    @FXML
    void OnMouseclickedPedidoButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("PedidoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        pedido.setTitle("Menú pedido");
        pedido.setScene(scene);
        pedido.show();

    }

    @FXML
    void OnMouseclickedProductoButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        producto.setTitle("Menú producto");
        producto.setScene(scene);
        producto.show();

    }

    @FXML
    void OnMouseclickedReporteButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ReporteInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        reporte.setTitle("Menú producto");
        reporte.setScene(scene);
        reporte.show();

    }

    @FXML
    void OnMouseclickedVentasButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VentasInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        venta.setTitle("Menú Ventas");
        venta.setScene(scene);
        venta.show();

    }

    @FXML
    void initialize() {
        assert productoButton != null : "fx:id=\"productoButton\" was not injected: check your FXML file 'Admin-view.fxml'.";
        assert menuButton != null : "fx:id=\"menuButton\" was not injected: check your FXML file 'Admin-view.fxml'.";
        assert pedidoButton != null : "fx:id=\"pedidoButton\" was not injected: check your FXML file 'Admin-view.fxml'.";
        assert ventaButton != null : "fx:id=\"ventaButton\" was not injected: check your FXML file 'Admin-view.fxml'.";
        assert reporteButton != null : "fx:id=\"reporteButton\" was not injected: check your FXML file 'Admin-view.fxml'.";
        assert cerrarButton != null : "fx:id=\"cerrarButton\" was not injected: check your FXML file 'Admin-view.fxml'.";

    }
}
