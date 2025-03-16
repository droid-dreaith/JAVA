
import java.util.ArrayList;
import java.util.List;

public class Department {

    private String depName;
    private String depCode;
    private List<Person> organization;

    // Constructor
    public Department(String depName, String depCode) {
        this.depName = depName;
        this.depCode = depCode;
        this.organization = new ArrayList<>();
    }

    // Add person
    public void addPerson(Person person) {
        this.organization.add(person);
    }

    // List organization
    public void listOrganization() {
        System.out.println("\nDepartment of " + depName + ", " + depCode + ":");

        for (Person p : organization) {
            System.out.println("-----------------------------------");
            p.displayInfo();
            System.out.println("------------------------------------");
        }
    }

    // List tuition
    public void listTuition() {
        System.out.println("\nTuition in the course:");
        for (Person p : organization) {
            System.out.println("Name: " + p.getName() + " | Course: " + p.getCourse() + " | Tuition: " + p.getTuition());
        }
    }

    // Go to organization
    public void goToOrganization() {
        System.out.println("\nYou are now in the department of:");
        for (Person p : organization) {
            p.Organization();
            System.out.println("Good news! You can also participate at their Organization!");
        }
    }

    Iterable<Person> getOrganization() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
