import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
public class JavaAppendToFile {
private static String filePath = "your_file_path_here";
public static void main(String[] args) {
String appendText = "This String will be appended to the file, Byte=0x0A
0xFF";

appendUsingFileWriter(filePath, appendText);
appendUsingBufferedWriter(filePath, appendText);
appendUsingPrintWriter(filePath, appendText);
appendUsingFileOutputStream(filePath, appendText);
}
private static void appendUsingFileWriter(String filePath, String text) {
try (FileWriter fr = new FileWriter(filePath, true)) {
fr.write(text);
} catch (IOException e) {
e.printStackTrace();
}
}
private static void appendUsingBufferedWriter(String filePath, String text) {
try (BufferedWriter br = new BufferedWriter(new FileWriter(filePath, true))) {
br.write(text);
} catch (IOException e) {
e.printStackTrace();
}
}
private static void appendUsingPrintWriter(String filePath, String text) {
try (PrintWriter pr = new PrintWriter(new BufferedWriter(new
FileWriter(filePath, true)))) {
pr.println(text);
} catch (IOException e) {
e.printStackTrace();
}
}
private static void appendUsingFileOutputStream(String filePath, String data) {
try (OutputStream os = new FileOutputStream(filePath, true)) {
os.write(data.getBytes());
} catch (IOException e) {
e.printStackTrace();
}
}
}