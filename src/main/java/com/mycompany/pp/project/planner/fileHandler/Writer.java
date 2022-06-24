package com.mycompany.pp.project.planner.fileHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
    public void writer(String path, String content){
        try{
            FileWriter file = new FileWriter(path);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(content);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
