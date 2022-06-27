package com.mycompany.pp.project.planner.fileHandler;

import java.io.File;

public class DirectoryMaker {
    public void dMaker(String fileName){
        new File("./Projects/"+fileName).mkdirs();
    }
    public void deleteDirectory(File file) throws Exception {
        if (file.isDirectory()) {
          File[] entries = file.listFiles();
          if (entries != null) {
            for (File entry : entries) {
              deleteDirectory(entry);
            }
          }
        }
      }
}
