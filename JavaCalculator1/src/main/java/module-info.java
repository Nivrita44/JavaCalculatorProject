module com.example.javacalculator1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javacalculator1 to javafx.fxml;
    exports com.example.javacalculator1;
}