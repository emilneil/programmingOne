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
        list infoName = new ArrayList;
        infoName.add("Name");
        infoName.add("Age");
        infoName.add("height");
        y = 0;
        while(y<3){
            //y is the number of items in the array
            while(x=0) {
                //x is whether the name is correct or not
                System.out.println("input your " + infoName(y));
                String name = scan.nextline();
                System.out.println("Is " + name + " correct? (true or false)");
                Boolean nameInfo = scan.nextBoolean();
                if (nameInfo = true) {
                    x = x + 1;
                    y = y + 1;
                } else {
                    x = x;
                }
            }
            try {
                FileWriter file = new FileWriter("src/resources/writing.txt");
                BufferedWriter buff = new BufferedWriter(file);
                buff.write(name);
                buff.write(":");
                buff.close();
                }
                catch (IOException var3) {
                    System.out.println("you did a bad");
                }
        }

    }
}
