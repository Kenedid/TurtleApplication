package com.company.GUI;



import com.company.Models.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Kenedid on 04-05-2017.
 */
public class Login {

    private Button login = new Button("Login");
  private TextField TF1 = new TextField();
  private PasswordField PF1 = new PasswordField();
  private Text burger = new Text("Brugernavn");
  private Text kode = new Text("Kode");
  private Button opretbruger = new Button("Opret ny bruger");
  GridPane gridPane = new GridPane();
  Text text = new Text();
  private Scene scene;

   private Model model;

    public Login(Stage stage, Model model){

      this.model = model;
      login.setStyle("-fx-background-color: #0f6fe0");
      setLoginStage();
      opretbruger.setStyle("-fx-background-color: #0be037");
      stage.setTitle("Welcome to Kenno-webbroswer");
       stage.setScene(scene);

        login.setOnAction(event -> {
                  validatelogin(stage);});
        TF1.setOnKeyPressed(KeyEvent -> {
              if(KeyEvent.getCode()== KeyCode.ENTER)validatelogin(stage);});

        PF1.setOnKeyPressed(KeyEvent-> {
            if(KeyEvent.getCode()== KeyCode.ENTER)validatelogin(stage);
                });

        stage.show();

  }

    private void validatelogin(Stage stage) {
        if (TF1.getText().equalsIgnoreCase("abe") && PF1.getText().equalsIgnoreCase("123")) {
            text.setText("Infomation er rigtigt");
            text.setFill(Color.GREEN);
        } else if (TF1.getText().isEmpty()) {
            text.setText("Brugernavnfelt ikke udfyldt");
            text.setFill(Color.RED);
        } else if (PF1.getText().isEmpty()) {
            text.setText("Kodenfelt ikke udfyldt ");
            text.setFill(Color.RED);
        } else {
            text.setText("Ingen felt udfyldt");
            text.setFill(Color.RED);
        }
    }

    private void setLoginStage(){

      TF1.setPromptText("Burgernavn");
      PF1.setPromptText("Kode");

      gridPane.setHgap(20);
      gridPane.setVgap(30);

      gridPane.setPadding(new Insets(10,10,10,10));

      gridPane.add(login,0,4);
      gridPane.add(TF1,0,1);
      gridPane.add(PF1,0,3);
      gridPane.add(burger,0,0);
      gridPane.add(kode,0,2);
      gridPane.add(opretbruger,0,5);
      gridPane.setAlignment(Pos.CENTER);

       if(scene == null){

           scene = new Scene(gridPane,600,400,Color.AZURE);

       }


    }
}

