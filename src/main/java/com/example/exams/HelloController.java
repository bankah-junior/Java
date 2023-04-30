package com.example.exams;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label alertMessage;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    void Cancel(ActionEvent event) {
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();
    }

    @FXML
    void Login(ActionEvent event) {
        String userName = username.getText();
        String userPassword = password.getText();

        if (ValidateInput(userName, userPassword)) {
            System.out.println("Successfully logged in!");
            mainViewPage();
        } else {
            System.out.println("Invalid login details!");
        }
    }

    @FXML
    void Register(ActionEvent event) {

    }

    @FXML
    private boolean ValidateInput(String name, String password) {
        return name.equals("bankah") && password.equals("123");
    }

    @FXML
    private void mainViewPage(){
        try {
            // load the details-view page FXML file
            Parent root = FXMLLoader.load(getClass().getResource("main-view.fxml"));

            // create a new stage
            Stage stage = new Stage();
            stage.setTitle("Student Portal");
            stage.setScene(new Scene(root, 601, 329));

            // show the new stage
            stage.show();

            // close the login stage
            Stage loginStage = (Stage) username.getScene().getWindow();
            loginStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
