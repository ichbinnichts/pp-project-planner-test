package com.mycompany.pp.project.planner.fileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
    public void writer(String path, String content){
        try{
            FileWriter file = new FileWriter(path, true);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(content);
            printWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void createFile(String path){
        try {
            File file = new File(path);
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
