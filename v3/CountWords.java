import java.io.FileNotFoundException;
import java.io.IOException;
public class CountWords{

    public static void main(String[] args) {

        if (args.length > 0){

            String fileName = args[0];
            FileLineCounter flc = new FileLineCounter();
            try{
                int count = flc.countLines(fileName);
                System.out.println("The file had "+count+" lines");}
            catch(FileNotFoundException e){
                System.out.println("File not found: "+fileName);
                System.out.println(e.getMessage());
            }
            catch(IOException e){
                System.out.println("IOException ");             
                System.out.println(e.getMessage());}
        }
        else
            System.out.println("usage: java CountWords <filename>");

    }

}
