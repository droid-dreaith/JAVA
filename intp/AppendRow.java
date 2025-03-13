import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class AppendRow{
// Static method to append text to a file
public static void outputFile(String filePath) {
try {
File file = new File(filePath);
FileWriter writer = new FileWriter(file, true); // true for append mode
writer.write("\nThis little light of mine, I’m gonna let it shine\n");
writer.close();
System.out.println("Data appended successfully.");
} catch (IOException e) {
System.out.println("Error appending data to file.");
e.printStackTrace(); // Print the stack trace for debugging
}
}
}