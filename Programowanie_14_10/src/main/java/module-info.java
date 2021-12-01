module com.example.programowanie_14_10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires eu.hansolo.tilesfx;

    opens com.example.programowanie_14_10 to javafx.fxml;
    exports com.example.programowanie_14_10;
}