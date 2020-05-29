package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
        Parent parent = loader.load();
        Scene mainScene = new Scene( parent );
        primaryStage.setScene( mainScene );
        primaryStage.setTitle("Imob");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}