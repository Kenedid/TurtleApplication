package com.company.GUI;

import com.company.GUI.Login;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Login login = new Login();
        primaryStage.setScene(login.Login(primaryStage));
        primaryStage.show();
    }
}
