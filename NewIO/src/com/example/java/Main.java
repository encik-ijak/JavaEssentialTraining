package com.example.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        //System.out.println("working dir : "+System.getProperty("user.dir"));
        Path sourceFile = Paths.get("NewIO\\files", "file.txt");
        Path targetFile = Paths.get("NewIO\\files", "target.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
