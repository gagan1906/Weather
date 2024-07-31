module com.example.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.example.weather to javafx.fxml; // Add this line to allow FXMLLoader access
    exports com.example.weather; // Make sure to export the package
}
