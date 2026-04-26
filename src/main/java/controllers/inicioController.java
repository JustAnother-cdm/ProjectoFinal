package controllers;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import utilities.Paths;

public class InicioController {

    @FXML
    private PasswordField Contraseña;

    @FXML
    private TextField id;

    @FXML
    void logIn(ActionEvent event) {

    }

    @FXML
    void signUp(ActionEvent event) {
        Main.main.setScene(Paths.CREAR_VISTANTE);
    }
}
