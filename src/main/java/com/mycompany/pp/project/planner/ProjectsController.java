package com.mycompany.pp.project.planner;

import java.io.IOException;
import com.mycompany.pp.project.planner.fileHandler.DirectoryMaker;
import com.mycompany.pp.project.planner.fileHandler.Writer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProjectsController extends Controller {
    @FXML
    private TextField projectName, numberOfMembers;
    @FXML
    private String cProjectName;
    @FXML 
    private int cNumberOfMembers;
    @FXML 
    private Label projectLabel;
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