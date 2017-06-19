package com.company.Models;

import com.company.Controllers.OpretbrugerController;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

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

   private Button opret = new Button("Opret ny bruger");

   GridPane gridPane = new GridPane();

   private Button tilabge = new Button("tilbage");
   private Text navntext = new Text("Navn");
   private Text cprtext = new Text("Cpr");
   private Text addrssetext = new Text("Addrsse");
   private Text emaiiltext = new Text("Email");
   private Text agetext = new Text("Age");


   public OpretBruger(OpretbrugerController opretbrugerController){

       super();
       this.opretbrugerController= opretbrugerController;
   }

    public void setbrugerstage(){



    }






}
