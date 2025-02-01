package com.sb.workflow.sbgit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Plan {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            // Load the configuration file
            properties.load(new FileInputStream("config/application.properties"));

            // Simulate planning phase
            String appName = properties.getProperty("app.name");
            String appVersion = properties.getProperty("app.version");
            String appEnvironment = properties.getProperty("app.environment");

            System.out.println("Planning deployment for " + appName + " version " + appVersion + " in " + appEnvironment + " environment.");
            System.out.println("Plan: Deploy new version and update configuration.");
        } catch (IOException e) {
            System.err.println("Failed to load configuration file: " + e.getMessage());
        }
    }
}