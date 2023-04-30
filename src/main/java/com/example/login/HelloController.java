package com.example.login;

import connection.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label loginMessageLabel;
    @FXML
    private Button cancelButton;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView lockImageView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterpasswordField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("Images/formImg.jpg");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File lockFile = new File("Images/lock.png");
        Image lockImage = new Image(lockFile.toURI().toString());
        lockImageView.setImage(lockImage);

    }

    /*@FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/

    public void loginButtonOnAction(ActionEvent event) {

        if (usernameTextField.getText().isBlank() == false && enterpasswordField.getText().isBlank() == false) {
            validateLogin();
        }   else {
            loginMessageLabel.setText("Please enter username and password");
        }
    }

    @FXML
    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void validateLogin(){
        DatabaseConnection db = new DatabaseConnection();
        String dbFirstName = db.firstname();
        String dbSurname = db.surname();
        String utf = usernameTextField.getText();
        String epf = enterpasswordField.getText();

        if (isValidCredentials(utf, epf)) {
            // successful login
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login Successful");
            alert.setHeaderText(null);
            alert.setContentText("Welcome, " + dbSurname + " " + dbFirstName);
            alert.showAndWait();
            loginMessageLabel.setText("Successfully logged in!");
            usernameTextField.setText("");
            enterpasswordField.setText("");
        } else {
            // invalid credentials
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Invalid username or password.");
            alert.showAndWait();
            loginMessageLabel.setText("Try Again!");
        }
    }

    private boolean isValidCredentials(String username, String password) {
        DatabaseConnection db = new DatabaseConnection();
        String un = db.username();
        String up = db.password();
        return username.equals(un) && password.equals(up);
    }

}