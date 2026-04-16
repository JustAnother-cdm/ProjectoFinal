package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilities.Paths;

public class Main extends Application {
    public static Main main;
    private Stage stageWindow;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        main = this;
        stageWindow = stage;
        setScene(Paths.INICIO);

    }


    public void setScene(String Paths){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths));
        try{
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            stageWindow.setScene(scene);
            stageWindow.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
