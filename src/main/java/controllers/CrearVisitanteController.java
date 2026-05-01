package controllers;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.image.ImageView;

import utilities.Paths;


import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;

public class CrearVisitanteController {
    private Dragboard dragboard;

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
    private ImageView imageView;

    @FXML
    void Enviar(ActionEvent event) {
        Main.main.setScene(Paths.INICIO);
    }


    @FXML
    void imageViewDragDropped(DragEvent event) {
        dragboard = event.getDragboard();
        if (dragboard.hasFiles() || dragboard.hasImage()) {
            try{
                imageView.setImage(new Image(new FileInputStream(dragboard.getFiles().get(0))));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @FXML
    void imageViewDragOver(DragEvent event) {
        dragboard = event.getDragboard();
        if (dragboard.hasFiles() || dragboard.hasImage()) {
            event.acceptTransferModes(TransferMode.COPY);
        }
        event.consume();
    }

    }
