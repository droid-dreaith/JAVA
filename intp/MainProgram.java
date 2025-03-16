import java.util.Scanner;
import EmployeePackage.EmployeeInfo;
import Student.Acadinfo;
import Student.StudentInfo;

public class MainProgram {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
// Creating an instance of StudentInfo from the Student package
StudentInfo si = new StudentInfo(input);
// Displaying student details using the method from StudentInfo
si.displayStudent();
// Creating an instance of Acadinfo from the Student package
Acadinfo see = new Acadinfo(input); // Pass the Scanner object to Acadinfo constructor
// Displaying educational details using the method from Acadinfo
see.displayEducDetails();
// Creating an instance of EmployeeInfo from the EmployeePackage
EmployeeInfo details = new EmployeeInfo();
// Displaying employee details using the method from EmployeeInfo
details.displayEmployeeDetails();
// Close the Scanner object after use
input.close();
}
}