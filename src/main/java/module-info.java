module com.example.kalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.kalc to javafx.fxml;
    exports com.example.kalc;
}