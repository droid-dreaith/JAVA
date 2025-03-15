
public class BSNursing extends Person {

    private String Health_and_Medicine;

    public BSNursing(String name, int age, int studentNum, String gender, double tuition, String Health_and_Medicine) {
        super(name, age, studentNum, "BSNursing", gender, tuition);
        this.Health_and_Medicine = Health_and_Medicine;
    }

    @Override
    public void Organization() {
        System.out.println(getName() + " is currently taking the course of Bachelor of Science in Nursing, at the department of " + Health_and_Medicine + ".");
    }
}
