import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Ventana {
    public AnchorPane pane;

    public AnchorPane construir(){
        this.pane=new AnchorPane();
        //Aqui va el constructor.
        Label t1=new Label("Vacunas");
        t1.setFont(new Font("Arial", 30));
        t1.setTextFill(Color.web("#000000"));
        t1.setLayoutX(10);
        t1.setLayoutY(10);
        Label lblN=new Label("Nombre vacuna");
        lblN.setLayoutX(10);
        lblN.setLayoutY(50);
        TextField txtNo=new TextField();
        txtNo.setPrefSize(150,25);
        txtNo.setLayoutX(10);
        txtNo.setLayoutY(70);

        Label lblMarca=new Label("Marca vacuna");
        lblMarca.setLayoutX(180);
        lblMarca.setLayoutY(50);
        TextField txtMarca=new TextField();
        txtMarca.setPrefSize(150,25);
        txtMarca.setLayoutX(180);
        txtMarca.setLayoutY(70);

        Label lblDosis=new Label("N. Dosis");
        lblDosis.setLayoutX(340);
        lblDosis.setLayoutY(50);
        TextField txtDosis=new TextField();
        txtDosis.setPrefSize(150,25);
        txtDosis.setLayoutX(340);
        txtDosis.setLayoutY(70);

        Button btnInsertarV=new Button("Insertar");
        btnInsertarV.setPrefSize(80,25);
        btnInsertarV.setLayoutX(500);
        btnInsertarV.setLayoutY(70);

        ListView listaVacunas= new ListView();
        listaVacunas.setPrefSize(580,250);
        listaVacunas.setLayoutX(10);
        listaVacunas.setLayoutY(120);

        this.pane.getChildren().addAll(t1,lblN,txtNo,lblMarca,txtMarca,lblDosis,txtDosis,btnInsertarV,listaVacunas);

        //EVENTOS
        btnInsertarV.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String nv=txtNo.getText();
                String mv=txtMarca.getText();
                String dv=txtDosis.getText();
                if (nv.equals("") || mv.equals("") ||dv.equals("")){
                    Alert alerta=new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("ERROR");
                    alerta.setContentText("Favor de llenar todos los campos");
                    alerta.show();
                } else {
                    int conv=Integer.parseInt(dv);
                    Vacuna vacuna=new Vacuna(nv,mv,conv);
                    Alert alerta=new Alert(Alert.AlertType.INFORMATION);
                    alerta.setTitle("LISTO");
                    alerta.setContentText("Vacuna creada correctamente");
                    alerta.show();
                    txtNo.setText("");
                    txtMarca.setText("");
                    txtDosis.setText("");
                }
            }
        });

        return pane;
    }
}
