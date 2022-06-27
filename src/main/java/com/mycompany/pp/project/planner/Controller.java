package com.mycompany.pp.project.planner;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class Controller {
    

    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("home");
    }
     @FXML
    private void switchToGraphs() throws IOException {
        App.setRoot("graphs");
    }
     @FXML
    private void switchToPeople() throws IOException {
        App.setRoot("people");
    }
     @FXML
    private void switchToProjects() throws IOException {
        App.setRoot("projects");
    }
     @FXML
    private void exitButton() throws IOException {
        Platform.exit();
    }
    
}
