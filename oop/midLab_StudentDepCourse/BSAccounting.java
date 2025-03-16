
public class BSAccounting extends Person {

    private String Business;

    public BSAccounting(String name, int age, int studentNum, String gender, double tuition, String Business) {
        super(name, age, studentNum, "BSAccounting", gender, tuition);
        this.Business = Business;
    }

    @Override
    public void Organization() {
        System.out.println(getName() + " is currently taking the course of Bachelor of Science in Accounting, at the department of " + Business + ".");
    }
}
