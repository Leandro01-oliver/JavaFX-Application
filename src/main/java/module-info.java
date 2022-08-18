module com.example.testeaps {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.testeaps.Models to javafx.fxml;
    exports com.example.testeaps.Models;
    exports com.example.testeaps.Controller;
    exports com.example.testeaps.Application;

}