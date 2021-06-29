import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Ventana ventana=new Ventana(primaryStage);
        Scene escena=new Scene(ventana.crearVentana());
        primaryStage.setWidth(900);
        primaryStage.setHeight(600);
        primaryStage.setTitle("Archivos");
        primaryStage.setScene(escena);
        primaryStage.show();
    }
}
