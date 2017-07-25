package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args){

        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader;

        try
        {
            bufferedReader = new BufferedReader();
            bufferedWriter = new BufferedWriter();

        }
        catch (IOException io)
        {
            System.out.print("File not found");
        }


    }
}
