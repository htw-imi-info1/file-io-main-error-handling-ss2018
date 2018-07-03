import java.io.FileReader;
import java.io.BufferedReader;

public class CountWords{

    public static void main(String[] args) throws Exception{

        if (args.length > 0){
            String fileName = args[0];
            FileReader fr = new FileReader(fileName);
            BufferedReader rd = new BufferedReader(fr);
            String line = "";
            int count = 0;
            while (line != null){
                line = rd.readLine();
                count++;
                System.out.println(line);
            }
            System.out.println("The file had "+count+" lines");
            // close file
            rd.close();
            fr.close();
        }
        else
            System.out.println("usage: java CountWords <filename>");

    }

}
