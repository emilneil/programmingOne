package emily1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {

    public static void main(String[] args) {
        String check = ("im tired");
        try {
            FileWriter file = new FileWriter("src/resources/writing.txt");
            BufferedWriter buff = new BufferedWriter(file);
            buff.write(check);
            buff.newLine();
            buff.write("hello whats up");
            buff.close();
        }
        catch (IOException var3) {
            System.out.println("you did a bad");
        }

        }
    }
