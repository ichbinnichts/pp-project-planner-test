package com.mycompany.pp.project.planner;

import java.io.IOException;

import com.mycompany.pp.project.planner.fileHandler.DirectoryMaker;
import com.mycompany.pp.project.planner.fileHandler.Reader;
import com.mycompany.pp.project.planner.fileHandler.Writer;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField projectName, numberOfMembers;
    @FXML
    private String cProjectName;
    @FXML 
    private int cNumberOfMembers;
    @FXML 
    private Label projectLabel;

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
    @FXML
    private void addProject() throws IOException{
        App.setRoot("addProject");
    }
    @FXML
    private void next1(ActionEvent event) throws IOException{
        cNumberOfMembers = Integer.parseInt(numberOfMembers.getText());
        cProjectName = projectName.getText();
        projectLabel.setText(cProjectName);
        DirectoryMaker dm = new DirectoryMaker();
        dm.dMaker(cProjectName);
        Writer writer = new Writer();
        writer.createFile("./Projects/properties.txt");
        writer.writer("./Projects/properties.txt", cProjectName);
        App.setRoot("projects");
    }
}
