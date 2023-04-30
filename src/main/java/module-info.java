module com.example.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.example.login to javafx.fxml;
    exports com.example.login;
    exports connection;
    opens connection to javafx.fxml;
}