package com.company;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Kenedid on 04-05-2017.
 */
public class Login {
    protected String usernname = "Kenedid";
    protected String password = "1234";
    protected Object resetpassword;

    public Scene Login(Stage loginstage) {
        loginstage.setTitle("Turtle");

        Label turtletext = new Label("Welcome to Turtle");

        Label Usernametext = new Label("Username: ");

        Label Passwordtext = new Label("Password: ");

        TextField textFieldUsername = new TextField();
        textFieldUsername.setPromptText("Enter Username");
        GridPane.setConstraints(textFieldUsername,1,0);

        PasswordField textFieldPassword = new PasswordField();
        textFieldPassword.setPromptText("Enter Password");
        GridPane.setConstraints(textFieldPassword, 1, 1);

        // ResetButton

        Button resetbutton = new Button("Reset Password");
        resetbutton.setOnAction(event -> {
            loginstage.setScene(resetPassword(loginstage));
        });

        //WrongText
        Text wrongText = new Text();

        Button exitbutton = new Button("Exit");
        exitbutton.setOnAction(event -> {

        });


        Button Menubutton = new Button("Log-in");

        Menubutton.setOnAction(event -> {
            if (textFieldUsername.getText().equalsIgnoreCase(usernname) && textFieldPassword.getText().equals(resetpassword)) {


            } else {
                wrongText.setFill(Color.FIREBRICK);
                wrongText.setText("Wrong information");
                exitbutton.setOnAction(event1 -> {
                });

            }
        });

        // Image
        Image imageTurtle = new Image("/Turtle.png/");
        ImageView viewimage = new ImageView();
        viewimage.setImage(imageTurtle);

        // Layout
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.add(turtletext, 0, 0);
        pane.add(Usernametext, 0, 1);
        pane.add(Passwordtext, 0, 2);
        pane.add(textFieldPassword, 1, 2);
        pane.add(Menubutton, 1, 3);
        pane.add(exitbutton, 2, 4);
        pane.add(viewimage, 0, 3);
        pane.add(wrongText, 2, 5);
        pane.add(resetbutton, 1, 4);
        pane.add(textFieldUsername,1,0);

        pane.setStyle("-fx-background-color: #389d0e;");



        return new Scene(pane,800,600);

      } protected Scene resetPassword(Stage resetStage){

        Text validData = new Text();

        resetStage.setTitle("Reset Password");

        Label viewUsername = new Label("Username: ");
        Label viewPassword = new Label("Password: ");
        Label resetPassword = new Label("Reset Password: ");

        TextField textFieldUsername = new TextField();
        textFieldUsername.setOnAction(event -> {
            if(!textFieldUsername.getText().equals(usernname)){

                validData.setFill(Color.BLACK);
                validData.setText("Wrong username");



            }else{
                validData.setFill(Color.BLACK);
                validData.setText("Write your old password");
            }

        });
        PasswordField textFieldPasword = new PasswordField();
        textFieldPasword.setOnAction(event -> {
            do{
                validData.setFill(Color.BLACK);
                validData.setText("Valid old password");

            }while (textFieldPasword.getText().equalsIgnoreCase(password));
        });
        PasswordField textFieldReset = new PasswordField();
        textFieldPasword.setOnAction(event -> {
            do{
                validData.setFill(Color.GREEN);
                validData.setText("Valid new password");

            }while (textFieldReset.getText().equals(resetpassword));
        });

        Button reset = new Button("Reset");
        reset.setOnAction(event -> {
            try {
                Login login = new Login();
                resetStage.setScene(login.Login(resetStage));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Layout
        GridPane gridPane = new GridPane();
        gridPane.add(viewUsername,0,1);
        gridPane.add(viewPassword,0,2);
        gridPane.add(resetPassword,0,3);
        gridPane.add(textFieldUsername,1,1);
        gridPane.add(textFieldPasword,1,2);
        gridPane.add(textFieldReset,1,3);
        gridPane.add(reset,1,4);
        gridPane.add(validData,2,5);
        gridPane.setStyle("-fx-background-color: #000000;");

        return new Scene(gridPane,500,300);
    }


}
