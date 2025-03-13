import java.io.File;

public class Attributes {

    public static void main(String[] args) {
        File file = new File("C:/Users/AndengUWU/Documents/GitHub/java/intp/Attributes.java");
        try  {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        } catch (Exception e) {
            System.out.println("The file does not exist.");
            e.printStackTrace();
        }
    }
}