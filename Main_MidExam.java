
import java.util.Scanner;

public class Main_MidExam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------------------\n     Welcome to our University System !\n----------------------------------------------------"
                + "\nWe have different departments : \n\n" + "College of Health and Medicine\nCollege of Communication\nCollege of Informatics and Computing Studies\nCollege of Natural Sciences\nCollege of Social Sciences\nCollege of Agriculture\nCollege of Business\n");

        System.out.println("Please enter available courses in the College :\n" + "BSNursing\nBSBiology\nBSAgriBusiness\nBSAccounting\nBSJournalism\nBSPsychology\nBSinformationTech\n------------------------------------------------");
        Department MyDep = new Department("General Studies", "GS01");
        boolean continueAdding = true;

        while (continueAdding) {
            System.out.println("1. Enter your course: ");
            String depType = sc.nextLine().trim();

            System.out.println("Enter name: ");
            String name = sc.nextLine().trim();

            int age = getValidInteger(sc, "Enter age: ");
            int studentNum = getValidInteger(sc, "Enter student number: ");

            System.out.println("Enter gender: ");
            String gender = sc.nextLine().trim();

            String department = "";
            int tuition = 0;

            switch (depType) {
                case "BSBiology" -> {
                    department = "College of Natural Sciences";
                    tuition = 30000;
                    MyDep.addPerson(new BSBiology(name, age, studentNum, gender, tuition, department));
                }

                case "BSInformationTech" -> {
                    department = "College of Informatics and Computing Studies";
                    tuition = 35000;
                    MyDep.addPerson(new BSinformationTech(name, age, studentNum, gender, tuition, department));
                }

                case "BSPsychology" -> {
                    department = "College of Social Sciences";
                    tuition = 28000;
                    MyDep.addPerson(new BSPsychology(name, age, studentNum, gender, tuition, department));
                }

                case "BSAccounting" -> {
                    department = "College of Business";
                    tuition = 32000;
                    MyDep.addPerson(new BSAccounting(name, age, studentNum, gender, tuition, department));
                }

                case "BSAgriBusiness" -> {
                    department = "College of Agriculture";
                    tuition = 27000;
                    MyDep.addPerson(new BSAgriBusiness(name, age, studentNum, gender, tuition, department));
                }

                case "BSJournalism" -> {
                    department = "College of Communication";
                    tuition = 29000;
                    MyDep.addPerson(new BSJournalism(name, age, studentNum, gender, tuition, department));
                }

                case "BSNursing" -> {
                    department = "College of Health and Medicine";
                    tuition = 40000;
                    MyDep.addPerson(new BSNursing(name, age, studentNum, gender, tuition, department));
                }

                default ->
                    System.out.println("Invalid Input for your department. Please try again...");
            }

            System.out.println("\nDo you want to add another person? Yes or No");
            continueAdding = sc.nextLine().trim().equalsIgnoreCase("yes");
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("\n---------------- Student Information Table --------------");
        System.out.println("------------------------------------------------------------");
        for (Person p : MyDep.getOrganization()) {
            p.displayInfo();
            System.out.println("------------------------------------------------------------");
        }

        MyDep.listTuition();
        MyDep.goToOrganization();
    }

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
