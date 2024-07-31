package com.example.weather;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/weather/MainView.fxml"));

            // Set the title and scene
            primaryStage.setTitle("Weather Application");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace for debugging
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
