package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class homeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button IngresarButton;

    @FXML
    private PasswordField password;
    Usuario administrador = new Usuario();
    Usuario vendedor = new Usuario();
    Stage callMenu = new Stage();
    Stage menuAdministrador = new Stage();
    Stage menuVendedor = new Stage();
    @FXML
    private TextField user;

    @FXML
    void OnMouseclickedIngresarButton(MouseEvent event) {
        String nombreUsuario = user.getText();
        String contrasena = password.getText();

        try{
            if (nombreUsuario.equals(administrador.getUsuario()) && contrasena.equals(administrador.getContrasena())){
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Admin-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                callMenu.setTitle("Menu Administrador");
                callMenu.setScene(scene);
                callMenu.show();
            } else if (nombreUsuario.equals(vendedor.getUsuario2()) && contrasena.equals(vendedor.getContrasena2())){
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Vendedor_view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                menuVendedor.setTitle("Menu Vendedor");
                menuVendedor.setScene(scene);
                menuVendedor.show();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    void initialize() {
    }
}
