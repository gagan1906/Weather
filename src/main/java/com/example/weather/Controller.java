package com.example.weather;

import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField cityInput;
    @FXML
    private Button searchButton;
    @FXML
    private TextArea weatherDisplay;

    private WeatherService weatherService = new WeatherService();

    @FXML
    private void fetchWeather() {
        String city = cityInput.getText();
        try {
            String jsonResponse = weatherService.getWeather(city);
            Gson gson = new Gson();
            WeatherResponse weatherResponse = gson.fromJson(jsonResponse, WeatherResponse.class);
            float temperature = weatherResponse.getMain().getTemp();
            weatherDisplay.setText("Temperature in " + city + ": " + temperature + "°C");
        } catch (Exception e) {
            weatherDisplay.setText("Error: " + e.getMessage());
        }
    }
}
