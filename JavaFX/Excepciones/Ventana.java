import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Ventana {
    private AnchorPane pane;
    private Vacuna arregloVacunas[]= new Vacuna[2];
    private Persona arregloPersona[]= new Persona[2];
    private int cont=0;
    private int cue=0;


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
        listaVacunas.setPrefSize(330,250);
        listaVacunas.setLayoutX(10);
        listaVacunas.setLayoutY(120);

        Label lblNomper=new Label("Nombre de la persona");
        lblNomper.setLayoutX(350);
        lblNomper.setLayoutY(120);
        TextField txtNomper=new TextField();
        txtNomper.setPrefSize(220,25);
        txtNomper.setLayoutX(350);
        txtNomper.setLayoutY(150);

        Label lblCurp=new Label("CURP");
        lblCurp.setLayoutX(350);
        lblCurp.setLayoutY(190);
        TextField txtCurp=new TextField();
        txtCurp.setPrefSize(220,25);
        txtCurp.setLayoutX(350);
        txtCurp.setLayoutY(210);

        Label lblCombo=new Label("Sexo");
        lblCombo.setLayoutX(350);
        lblCombo.setLayoutY(245);
        ComboBox comboBox=new ComboBox();
        comboBox.getItems().addAll("Hombre", "Mujer", "Mujer Trans", "Hombre Trans", "No Binario", "Otro");
        comboBox.setPrefSize(220,25);
        comboBox.setLayoutX(350);
        comboBox.setLayoutY(280);

        Button btnInsertarP=new Button("Insertar");
        btnInsertarP.setPrefSize(80,25);
        btnInsertarP.setLayoutX(350);
        btnInsertarP.setLayoutY(320);

        ListView listaPersona= new ListView();
        listaPersona.setPrefSize(330,200);
        listaPersona.setLayoutX(10);
        listaPersona.setLayoutY(380);

        Button btnInsertarD=new Button("Detalles");
        btnInsertarD.setPrefSize(80,25);
        btnInsertarD.setLayoutX(350);
        btnInsertarD.setLayoutY(380);

        this.pane.getChildren().addAll(t1,lblN,txtNo,lblMarca,txtMarca,lblDosis,txtDosis,btnInsertarV,listaVacunas,lblNomper,txtNomper,lblCurp,txtCurp,lblCombo,comboBox,btnInsertarP,listaPersona, btnInsertarD);

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
                    try{
                        int conv=Integer.parseInt(dv);
                        Vacuna vacuna=new Vacuna(nv,mv,conv);
                        arregloVacunas[cont]= vacuna;
                        cont++;
                        lauchSucess("Vacuna creada correctamente");
                        txtNo.setText("");
                        txtMarca.setText("");
                        txtDosis.setText("");
                        listaVacunas.getItems().addAll(vacuna.getNombre());
                    } catch (NumberFormatException error) {
                        System.out.println(error.getMessage());
                        lauchError("El numero insertado no es valido");
                    } catch (ArrayIndexOutOfBoundsException error){
                        lauchError("No se pueden agregar mas registros");
                    } catch (Exception error) {
                        lauchError("Ocurrio un error inesperado");
                    }

                }
            }
        });
        btnInsertarP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String sex=comboBox.getSelectionModel().getSelectedItem().toString();
                int pos=(int) listaVacunas.getSelectionModel().getSelectedIndex();
                System.out.println(sex+"  "+arregloVacunas[pos].getN_Dosis());
                String np=txtNomper.getText();
                String cp=txtCurp.getText();
                if (np.equals("") || cp.equals("") ||sex.equals("")){
                    lauchError("Favor de llenar todos los campos");
                } else {
                    try{
                        Persona persona=new Persona(np,cp, sex);
                        lauchSucess("Se ha registrado correctamente");
                        txtNomper.setText("");
                        txtCurp.setText("");
                        listaPersona.getItems().addAll(persona.getNombre());
                    } catch (NumberFormatException error) {
                        lauchError("La Curp es invalida");
                    } catch (Exception error) {
                        lauchError("Ocurrio un error inesperado");
                    }

                }
            }
        });
        btnInsertarD.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                int pus=(int) listaPersona.getSelectionModel().getSelectedIndex();
                Persona persona1= new Persona("Liadeo", "asdasd", "Hombre");
                Vacuna vacuna1= new Vacuna("Cansino", "asdasd", 2);
                lauchSucess("Detalles:\n Nommbre de la persona: "+persona1.getNombre()+"\nCurp: "+persona1.getCurp()
                +"\nSexo: "+persona1.getSexo()+"\nNombre de la vacuna: "+vacuna1.getNombre()+"\nMarca de la vcacuna:"+vacuna1.getMarcaVacuna()
                        +"\nNumero de dosis: "+vacuna1.getN_Dosis());
            }
        });

        return pane;
    }
    public void lauchError(String mensaje){
        Alert alerta=new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("ERROR");
        alerta.setContentText(mensaje);
        alerta.show();
    }
    public void lauchSucess(String mensaje){
        Alert alerta=new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("LISTO");
        alerta.setContentText(mensaje);
        alerta.show();
    }
}
