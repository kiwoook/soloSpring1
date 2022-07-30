module com.example.solospring1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solospring1 to javafx.fxml;
    exports com.example.solospring1;
}