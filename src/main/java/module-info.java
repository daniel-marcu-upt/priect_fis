module com.example.incercare {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.incercare to javafx.fxml;
    exports com.example.incercare;
}