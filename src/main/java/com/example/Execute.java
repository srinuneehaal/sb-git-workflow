package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Execute {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {

            System.out.println("Loading properties from file Execute");
            // Load the configuration file
            properties.load(new FileInputStream("src/main/config/application.properties"));

            // Simulate execution phase
            String appName = properties.getProperty("app.name");
            String appVersion = properties.getProperty("app.version");
            String appEnvironment = properties.getProperty("app.environment");

            System.out.println("Executing deployment for " + appName + " version " + appVersion + " in " + appEnvironment + " environment.");
            System.out.println("Deployment successful!");
        } catch (IOException e) {
            System.err.println("Failed to load configuration file: " + e.getMessage());
        }
    }
}