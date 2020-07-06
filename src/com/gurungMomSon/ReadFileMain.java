package com.gurungMomSon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMain {
    private static File file;
    private static FileReader fileReader;
    private static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        file = new File("config/myText.txt");
        fileReader = new FileReader(file);
        reader = new BufferedReader(fileReader);
        String readLine=null;
        while ((readLine = reader.readLine()) != null) {
            System.out.println(readLine);

        }
        reader.close();

    }
}
