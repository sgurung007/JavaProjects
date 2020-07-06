package com.gurungMomSon;

import java.io.*;
import java.util.Properties;

public class Main {

    private static MyAbstract person1;
    private static Properties configuration1;
    private static FileInputStream configurationFile;
    private static File file;
    private static FileWriter fileWriter;
    private static BufferedWriter writer;

    public static void main(String[] args) throws IOException {
        person1 = new Employee();
        person1.displayEmail();

        configuration1 = new Properties();
        configurationFile = new FileInputStream("config/configuration.properties");
        configuration1.load(configurationFile);
        System.out.println(configuration1.getProperty("url")+"\n"+
                configuration1.getProperty("userName")+"\n"+
                configuration1.getProperty("passWord")+"\n"+
                configuration1.getProperty("isEligible")+"\n"+
                configuration1.getProperty("salary")+"\n"+
                System.getProperty("user.dir")
                );
        file=new File("config/myText.txt");
        fileWriter=new FileWriter(file,false);  //append true to add to the file instead of the new file everytime
        writer=new BufferedWriter(fileWriter);
        writer.write("\nsuraj gurung");
        writer.newLine();
        writer.write("second line");
        writer.newLine();
        writer.write("third line");
        writer.close();

    }
}
