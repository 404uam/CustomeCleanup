package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

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

            int count = 1;
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
                Stack<Person> stack = new Stack();

                String number = buffer[1];
                Person temp = new Person(buffer);
                stack.add(temp);

                lookAhead(number,stack,input,count);
                //System.out.println(count);

                checkSimilar(stack,merge,upload);

                inputLine = input.readLine();
                count++;
            }
            merge.close();
            upload.close();
        }
        catch (IOException io) {
            System.out.print("File not found " + io.getMessage());
        }

    }

    public static void lookAhead(String number, Stack<Person> stack, BufferedReader input,int count) throws IOException
    {
        input.mark(255);
        String nextLine = input.readLine();
        count++;
        if(nextLine != null) {
            String[] buffer = nextLine.split(",");

            if (buffer[1].equals(number)) {
                Person temp = new Person(buffer);
                stack.add(temp);
                lookAhead(number, stack, input, count);
            } else {
                input.reset();
                count--;
            }
        }
    }

    public static void checkSimilar(Stack<Person> stack,BufferedWriter merge,BufferedWriter upload) throws IOException
    {
        ArrayList<Person> list = new ArrayList<Person>();

        while(!stack.empty())
        {
            list.add(stack.pop());
        }

        for(int i = 1; i<list.size(); i++)
        {
            if(list.get(0).getLastName().toLowerCase().equals(list.get(i).getLastName().toLowerCase()))
            {
                System.out.println(list.get(i).toString());
                System.out.println(list.get(0).toString());
                merge.write(list.get(i).toString()+ "\n" +list.get(0) +"\n");
            }
            else
            {
                Scanner user = new Scanner(System.in);
                System.out.println("\nCurrent people: "+list.get(i)+"\n"+list.get(0)+"\n");
                System.out.println("Current Email:"+list.get(i).getEmail()+" Original:"+list.get(0).getEmail());
                System.out.println("This older than original? "+list.get(i).getCreated() + " Original:" + list.get(0).getCreated());
                String choice = user.nextLine();
                switch (choice){
                    case "Y":
                    case "y":
                        System.out.println(list.get(i).toString("yes"));
                        upload.write(list.get(i).toString("yes"));
                        break;
                    case "N":
                    case "n":
                        System.out.println(list.get(0).toString("yes"));
                        upload.write(list.get(0).toString("yes"));
                        break;
                    default:
                        merge.write(list.get(i).toString()+ "\n" +list.get(0) +"\n");
                        break;
                };

            }
        }
    }

}
