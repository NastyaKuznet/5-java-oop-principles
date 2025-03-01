package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler{
    @Override
    public void log(String message) {
        try(FileWriter fileWriter = new FileWriter("logger.txt",true))
        {
            fileWriter.append(message + "\n");
            fileWriter.flush();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
