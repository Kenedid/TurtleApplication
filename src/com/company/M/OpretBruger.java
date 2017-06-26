package com.company.M;

import com.company.Controllers.OpretbrugerController;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by Kenedid on 11-05-2017.
 */
public class OpretBruger {

    private OpretbrugerController opretbrugerController;
    private TextField navn = new TextField();
    private TextField cpr = new TextField();
    private TextField addrsse = new TextField();
    private TextField email = new TextField();
    private TextField age = new TextField();

    GridPane top;
    GridPane center;

    private Scene scene;

    private Button Opret;

    private Text text = new Text("Opret bruger");

    private Button tilabge;
    private Text navntext = new Text("Navn");
    private Text cprtext = new Text("Cpr");
    private Text addrssetext = new Text("Addrsse");
    private Text emaiiltext = new Text("Email");
    private Text agetext = new Text("Age");
   private FlowPane flowPane;
    public OpretBruger(OpretbrugerController opretbrugerController) {

        super();
        this.opretbrugerController = opretbrugerController;
    }

    public void setbruger(Stage stage) {

     flowPane = new FlowPane();
     Opret= new Button("Opret bruger");
     tilabge=new Button("Tilbage");






     setbrugerTop(stage);
     stage.show();
    }

    public void setbrugerTop(Stage stage) {
        top = new GridPane();
        top.setStyle("-fx-background-color: #13e03d");
        top.setHgap(10);
        top.setVgap(5);
        top.setPadding(new Insets(5, 5, 5, 5));
        top.add(text, 2, 1);
        top.setAlignment(Pos.CENTER);
        if(scene == null){

            scene = new Scene(top,300,400, Color.AZURE);

        }
    }

    public void setceter(Stage stage) {
        center = new GridPane();
        center.setStyle("-fx-background-color: #dae0d5");
        center.setHgap(20);
        center.setVgap(30);

        center.setPadding(new Insets(10, 10, 10, 10));
        center.add(navntext, 3, 2);
        center.add(cprtext, 3, 5);
        center.add(addrssetext, 3, 6);
        center.add(agetext, 4, 2);
        center.add(emaiiltext, 4, 3);
        center.setAlignment(Pos.CENTER);
        if(scene== null){

            scene= new Scene(center,300,400,Color.AZURE);
        }
    }

}