package com.eric.okpo_java;

import com.eric.okpo_java.lab4.Task2;
import com.eric.okpo_java.lab4.Task7;
import com.eric.okpo_java.lab4.Task8;
import com.eric.okpo_java.lab5.Task3;
import com.eric.okpo_java.lab5.Task9;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        new Task3().main();
    }
}