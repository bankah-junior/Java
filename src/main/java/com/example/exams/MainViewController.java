package com.example.exams;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.*;
import java.util.Scanner;

public class MainViewController {

    @FXML
    private TextArea ShowDetails;

    @FXML
    private TextField email;

    @FXML
    private TextField name;

    @FXML
    private TextField tel;

    @FXML
    void OpenSavedDetails(ActionEvent event) {

    }

    @FXML
    void ResetDetails(ActionEvent event) {

    }

    @FXML
    void SaveDetails(ActionEvent event) {
        String userName = name.getText();
        String userTel = tel.getText();
        String userEmail = email.getText();
        String filePath = "C:\\Users\\FRANK CHRISTOPHER\\Desktop\\Bankah Junior\\Projects\\Exams\\db\\db.txt";

        try {
            File databaseFile = new File(filePath);
            FileWriter insertData = new FileWriter(filePath);

            insertData.write("Name: " + userName.toUpperCase() + "\n");
            insertData.write("Tel: " + userTel.toUpperCase() + "\n");
            insertData.write("Email:: " + userEmail.toUpperCase() + "\n\n\n");
            insertData.close();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText(null);
            alert.setContentText("Data saved successfully!!");
            alert.showAndWait();

        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error!!!");
            alert.setHeaderText(null);
            alert.setContentText("Error occurred while saving");
            alert.showAndWait();

            e.printStackTrace();
        }
    }

}
