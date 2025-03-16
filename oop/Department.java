// Department.java

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String depName;
    private String depCode;
    private List<Person> organization;

    public Department(String depName, String depCode) {
        this.depName = depName;
        this.depCode = depCode;
        this.organization = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.organization.add(person);
    }

    public List<Person> getOrganization() {
        return organization;
    }

    public void listTuition() {
        System.out.println("\nTuition in the course:");
        for (Person p : organization) {
            System.out.println("Name: " + p.getName() + " | Course: " + p.getCourse() + " | Tuition: " + p.getTuition());
        }
    }

    public void goToOrganization() {
        System.out.println("\nYou are now in the department of:");
        for (Person p : organization) {
            p.organization();
            System.out.println("Good news! You can also participate at their Organization!");
        }
    }
}
