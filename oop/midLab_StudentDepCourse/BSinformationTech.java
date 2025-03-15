
public class BSinformationTech extends Person {

    private String CICS;

    public BSinformationTech(String name, int age, int studentNum, String gender, double tuition, String CICS) {
        super(name, age, studentNum, "BSInformationTech", gender, tuition);
        this.CICS = CICS;
    }

    @Override
    public void Organization() {
        System.out.println(getName() + " is currently taking the course of Bachelor of Science in Information Technology, at the department of " + CICS + ".");
    }
}
