package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args){

        BufferedWriter upload;
        BufferedWriter merge;
        BufferedReader input;

        try
        {
            input = Files.newBufferedReader(new File("C:\\Users\\Louis\\Desktop\\Customer Cleanup.csv").toPath());
            upload = Files.newBufferedWriter(new File("C:\\Users\\Louis\\Desktop\\Upload.csv").toPath());
            merge = Files.newBufferedWriter(new File("C:\\Users\\Louis\\Desktop\\Merge.csv").toPath());

            String inputLine = input.readLine();
            upload.write(inputLine+"\n");       //Write header for the file
            merge.write(inputLine+"\n");       //Write header for the file

            while(inputLine != null) {



                inputLine = input.readLine();
            }


        }
        catch (IOException io)
        {
            System.out.print("File not found " + io.getMessage());
        }


    }
}
