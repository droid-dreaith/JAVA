
public class BSBiology extends Person {

    private String Natural_Sciences;

    public BSBiology(String name, int age, int studentNum, String gender, double tuition, String Natural_Sciences) {
        super(name, age, studentNum, "BSBiology", gender, tuition);
        this.Natural_Sciences = Natural_Sciences;
    }

    @Override
    public void Organization() {
        System.out.println(getName() + " is currently taking the course of Bachelor of Science in Biology, at the department of " + Natural_Sciences + ".");
    }
}
