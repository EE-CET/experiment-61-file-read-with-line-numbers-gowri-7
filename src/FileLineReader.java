import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    public static void main(String[] args) {
        String fileName = "input.txt";
        
        // try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            
            String line;
            int lineNumber = 1;
            
            // Read line by line
            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

