package com.company.GUI;

import com.company.GUI.Login;
import com.company.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception {


        new Login(primaryStage,new Model());
    }

}
