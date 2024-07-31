package com.example.weather;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherService {
    private static final String API_KEY = "d2efa1fb5ed10371a0934df3ed00f819"; // Replace with your API key
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=London&appid=YOUR_API_KEY&units=metric\n";

    public String getWeather(String city) throws Exception {
        String urlString = BASE_URL + city + "&appid=" + API_KEY + "&units=metric"; // Use metric for Celsius
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        return response.toString();
    }
}
