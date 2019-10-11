
// Program to copy files using path and file classes

package copy_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author Amrit1.Kumar
 *
 */
public class CopyFiles2 {

    public static void main(String[] args) {
	// write your code here

        Path sourceFile = Paths.get("files", "loremipsum.txt");
        Path targetFile = Paths.get("files", "target.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
