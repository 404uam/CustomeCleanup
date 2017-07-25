package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

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

            inputLine = input.readLine();         //Read start of information

            while(inputLine != null) {
                /*
                   Header format
                   0 - Full Name
                   1 - Number (unformated)
                   2 - Discount
                   3 - Tax
                   4 - First Name
                   5 - Last Name
                   6 - Title
                   7 - Company
                   8 - DOB
                   9 - Address 1
                   10 - Address 2
                   11 - City
                   12 - Province
                   13 - Postal Code
                   14 - Country
                   15 - Home Number
                   16 - Work
                   17 - Fax
                   18 - Pager
                   19 - Mobile
                   20 - Email 1
                   21 - Email 2
                   22 - Website
                   23 - Custom
                   24 - Note
                   25 - Type
                 */
                ArrayList buf = new ArrayList();
                String[] buffer = inputLine.split(",");


                inputLine = input.readLine();
            }


        }
        catch (IOException io)
        {
            System.out.print("File not found " + io.getMessage());
        }


    }
}
