module com.eric.okpo_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.eric.okpo_java to javafx.fxml;
    exports com.eric.okpo_java;
}