import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class CountWords{

    public static void main(String[] args) throws Exception {

        if (args.length > 0){
            String fileName = args[0];
            FileReader fr = null;
            try {
                fr = new FileReader(fileName);

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
            catch(FileNotFoundException e){
                System.out.println("File not found: "+fileName);
                System.out.println(e.getMessage());
            }

        }
        else
            System.out.println("usage: java CountWords <filename>");

    }

}
