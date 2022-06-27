package com.mycompany.pp.project.planner.fileHandler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public String reader(String path){
        String lineContent = "";
        try{
            FileReader file = new FileReader(path);
            BufferedReader bReader = new BufferedReader(file);
            try{
                while (lineContent != ""){
                    lineContent = bReader.readLine();
                }
            }catch(FileNotFoundException e){
                lineContent += "Error: file not found";
            }
        }catch (IOException e){
            lineContent += "Error: file not read";
        }
        return lineContent;
    }
    public String readerLine(String path){
        String lineContent = "";
        try {
            FileReader file = new FileReader(path);
            BufferedReader bReader = new BufferedReader(file);
            lineContent = bReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lineContent;
    }
}
