
import java.util.Scanner;

public class Main_MidExam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Department MyDep = new Department("General Studies", "GS01");
        boolean continueAdding = true;

        while (continueAdding) {
            System.out.println("\n--- Enter Student Information ---");

            System.out.print("1. Enter your course: ");
            String depType = sc.nextLine().trim();

            System.out.print("Enter name: ");
            String name = sc.nextLine().trim();

            int age = getValidInteger(sc, "Enter age: ");
            int studentNum = getValidInteger(sc, "Enter student number: ");

            System.out.print("Enter gender: ");
            String gender = sc.nextLine().trim();

            int tuition = getValidInteger(sc, "Enter tuition: "); // Changed to int

            // Rule Switch for Cleaner Code
            switch (depType) {
                case "BSBiology" -> {
                    System.out.print("Enter department: ");
                    String Natural_Sciences = sc.nextLine().trim();
                    MyDep.addPerson(new BSBiology(name, age, studentNum, gender, tuition, Natural_Sciences));
                }

                case "BSInformationTech" -> {
                    System.out.print("Enter department: ");
                    String CICS = sc.nextLine().trim();
                    MyDep.addPerson(new BSinformationTech(name, age, studentNum, gender, tuition, CICS));
                }

                case "BSPsychology" -> {
                    System.out.print("Enter department: ");
                    String Social_Sciences = sc.nextLine().trim();
                    MyDep.addPerson(new BSPsychology(name, age, studentNum, gender, tuition, Social_Sciences));
                }

                case "BSAccounting" -> {
                    System.out.print("Enter department: ");
                    String Business = sc.nextLine().trim();
                    MyDep.addPerson(new BSAccounting(name, age, studentNum, gender, tuition, Business));
                }

                case "BSAgriBusiness" -> {
                    System.out.print("Enter department: ");
                    String Agriculture = sc.nextLine().trim();
                    MyDep.addPerson(new BSAgriBusiness(name, age, studentNum, gender, tuition, Agriculture));
                }

                case "BSJournalism" -> {
                    System.out.print("Enter department: ");
                    String Communication = sc.nextLine().trim();
                    MyDep.addPerson(new BSJournalism(name, age, studentNum, gender, tuition, Communication));
                }

                case "BSNursing" -> {
                    System.out.print("Enter department: ");
                    String Health_and_Medicine = sc.nextLine().trim();
                    MyDep.addPerson(new BSNursing(name, age, studentNum, gender, tuition, Health_and_Medicine));
                }

                default ->
                    System.out.println("Invalid Input for your department. Please try again...");
            }

            // Ask to continue adding more data
            System.out.println("\nDo you want to add another person? Yes or No");
            continueAdding = sc.nextLine().trim().equalsIgnoreCase("yes");
        }

        // Display Information in Table Format
        displayTable(MyDep);

        MyDep.listOrganization();
        MyDep.listTuition();
        MyDep.goToOrganization();
    }

    // Table Display Method
    private static void displayTable(Department dep) {
        System.out.println("\n---------------- Student Information Table ----------------");
        System.out.printf("%-20s %-10s %-15s %-15s %-10s %-10s\n",
                "Name", "Age", "Student No.", "Course", "Gender", "Tuition");
        System.out.println("------------------------------------------------------------");

        for (Person p : dep.getOrganization()) {
            System.out.printf("%-20s %-10d %-15d %-15s %-10s %-10d\n",
                    p.getName(), p.getAge(), p.getStudentNum(),
                    p.getCourse(), p.getGender(), p.getTuition());
        }
        System.out.println("------------------------------------------------------------");
    }

    // Method for Valid Integer Input
    private static int getValidInteger(Scanner sc, String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a valid integer.");
            }
        }
    }
}
