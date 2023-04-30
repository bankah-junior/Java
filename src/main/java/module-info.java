module com.example.exams {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exams to javafx.fxml;
    exports com.example.exams;
}