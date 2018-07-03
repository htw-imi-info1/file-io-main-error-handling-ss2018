import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileLineCounter
{
    public int countLines(String fileName) throws FileNotFoundException, IOException{
        FileReader fr = null;
        BufferedReader rd = null;
        int count = 0;
        try{
            fr = new FileReader(fileName);
            rd = new BufferedReader(fr);
            String line = "";

            while (line != null){
                line = rd.readLine();
                count++;
                //  System.out.println(line);
            }
        } catch(IOException e){
            throw e;
        }
        finally{
            // close file
            rd.close();
            fr.close();}
        return count;
    } 
}

