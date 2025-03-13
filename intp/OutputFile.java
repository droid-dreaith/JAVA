import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class OutputFile {
public static void main(String[] args) {
try {
File inputFile = new File("SampleText.txt");
File outputtFile = new File("SampleOutputText.txt");
Scanner scanner = new Scanner(inputFile);
FileWriter writer = new FileWriter(outputtFile);
int wordCount = 0;
while (scanner.hasNextLine()) {
String line = scanner.nextLine();
writer.write(line + "\n");
wordCount += line.split("\\s+").length;
}
System.out.println("Length: " + inputFile.length());
System.out.println("Path: " + inputFile.getAbsolutePath());
System.out.println("Number of words: " + wordCount);
writer.close();
scanner.close();
} catch (FileNotFoundException e) {
System.out.println("Input file not found.");
} catch (IOException e) {
System.out.println("Error writing to output file.");
}
}
public static void outputFile(String string) {
// TODO Auto-generated method stub
}
}''