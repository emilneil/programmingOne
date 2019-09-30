package emily1;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class inputOutputTest {
    public static void main(String[] args){
        //sets up a scanner
        Scanner scan = new Scanner(System.in);
        //adds a list
        ArrayList infoName = new ArrayList();
        infoName.add("Name");
        infoName.add("Age");
        infoName.add("height");
        int arrayNum = 0;
        int truthCheck = 0;
        while(arrayNum <3) {
            //y is the number of items in the array
            while (truthCheck == 0) {
                //x is whether the name is correct or not
                System.out.println("input your " + infoName.get(arrayNum));

                String name = scan.nextLine();

                System.out.println("Is " + name + " correct? (true or false)");

                Boolean nameInfo = scan.nextBoolean();
                if (nameInfo = true) {
                    truthCheck = truthCheck + 1;
                    arrayNum = arrayNum + 1;
                } else {
                    System.out.println("perfect");
                }
            }
            try{
                FileWriter file = new FileWriter("src/resources/info.txt");
                BufferedWriter buff = new BufferedWriter(file);
                buff.write(name);
                buff.write(":");
                buff.close();
            }
            catch(IOException var3){
                System.out.println("ERROR");

            }
        }

        }

    }
