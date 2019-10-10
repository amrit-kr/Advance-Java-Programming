
// Program to list all files except directory inside current path and also create new directory.

package file_listing_and_filter;

import java.io.File;
import java.io.FilenameFilter;


/**
 * @author Amrit1.Kumar
 *
 */
public class DirectoriesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    	// Creating a filter to lists files only
        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains(".");
        };
   
        
        String[] contents = new File(".").list(filter);
        for(String file: contents) {
            System.out.println(file);
        }
        
        // To create a new directory
        new File("myDirectory").mkdir();
        
    }
    
}
