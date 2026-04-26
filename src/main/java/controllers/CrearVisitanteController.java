package controllers;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import utilities.Paths;

public class CrearVisitanteController {


    @FXML
    private PasswordField contraseña;

    @FXML
    private TextField correo;

    @FXML
    private TextField estatura;

    @FXML
    private TextField id;

    @FXML
    private TextField nombre;

    @FXML
    private TextField saldo;

    @FXML
    void Enviar(ActionEvent event) {
        Main.main.setScene(Paths.INICIO);
    }

    }
