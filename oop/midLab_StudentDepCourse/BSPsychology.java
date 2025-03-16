
public class BSPsychology extends Person {

    private String Social_Sciences;

    public BSPsychology(String name, int age, int studentNum, String gender, double tuition, String Social_Sciences) {
        super(name, age, studentNum, "BSPsychology", gender, tuition);
        this.Social_Sciences = Social_Sciences;
    }

    @Override
    public void Organization() {
        System.out.println(getName() + " is currently taking the course of Bachelor of Science in Psychology, at the department of " + Social_Sciences + ".");
    }
}
