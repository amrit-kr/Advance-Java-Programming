
// Program to copy content of a file to new file using Path class

package filecopyexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


/**
 * @author Amrit1.Kumar
 *
 */
public class FileCopyExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Path source = Paths.get("C:\\Users\\amrit1.kumar\\Desktop\\example.txt");
        Path dest = Paths.get("C:\\Users\\amrit1.kumar\\Desktop\\new.txt");
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

    
}
