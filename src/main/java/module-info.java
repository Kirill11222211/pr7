module com.example.pr7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr7 to javafx.fxml;
    exports com.example.pr7;
}