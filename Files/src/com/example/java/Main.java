package com.example.java;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "Files/files/file.txt";
        String targetFIle = "Files/files/target.txt";

        try (FileReader fileReader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(targetFIle);
             )
        {
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                fileWriter.write(line+ "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

    }
}
