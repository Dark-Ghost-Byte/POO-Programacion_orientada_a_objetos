import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Principal extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Ventana ventana=new Ventana();
        AnchorPane pane=ventana.construir();
        pane.setPrefWidth(615);
        pane.setPrefHeight(650);
        Scene escena=new Scene(pane);
        primaryStage.setScene(escena);
        primaryStage.setTitle("COVID");
        primaryStage.setWidth(615);
        primaryStage.setHeight(650);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }

}
