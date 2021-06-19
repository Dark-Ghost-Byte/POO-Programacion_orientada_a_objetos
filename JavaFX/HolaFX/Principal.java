import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Principal extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane acomodo=new AnchorPane();
        acomodo.setStyle("-fx-background-color:#0f0f0f");
        Label label1=new Label("HOLA FX");
        label1.setLayoutX(175);
        label1.setLayoutY(100);
        label1.setPrefSize(200,50);
        label1.setFont(new Font("Arial", 30));
        label1.setTextFill(Color.web("#00ff3c"));
        acomodo.getChildren().add(label1);

        TextField txt1=new TextField();
        txt1.setLayoutX(150);
        txt1.setLayoutY(150);
        txt1.setPrefSize(200,50);
        acomodo.getChildren().add(txt1);

        Button bt1=new Button("Aceptar");
        bt1.setLayoutX(150);
        bt1.setLayoutY(220);
        bt1.setPrefSize(200,50);
        bt1.setStyle("-fx-background-color:#00ff3c;-fx-text-fill:#6b6b6b;-fx-border-radius:25px");
        acomodo.getChildren().add(bt1);


        //acomodo.setPrefWidth(500);
        //acomodo.setPrefHeight(500);
        Scene escena1=new Scene(acomodo);
        //escena1.set
        primaryStage.setScene(escena1);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("Hola Mundo");
        primaryStage.show();
    }
}
