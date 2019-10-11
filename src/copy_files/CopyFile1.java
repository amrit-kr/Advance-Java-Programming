
// Program to copy files using readers and buffers

package copy_files;

import java.io.*;

/**
 * @author Amrit1.Kumar
 *
 */
public class CopyFile1 {

	public static void main(String[] args) {
		// write your code here
		String sourceFile = "files/loremipsum.txt";
		String targetFile = "files/target.txt";

		try (FileReader fileReader = new FileReader(sourceFile);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				FileWriter writer = new FileWriter(targetFile);) {
			while (true) {
				String line = bufferedReader.readLine();
				if (line == null) {
					break;
				}
				writer.write(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
