
public class BSJournalism extends Person {

    private String Communication;

    public BSJournalism(String name, int age, int studentNum, String gender, double tuition, String Communication) {
        super(name, age, studentNum, "BSJournalism", gender, tuition);
        this.Communication = Communication;
    }

    @Override
    public void Organization() {
        System.out.println(getName() + " is currently taking the course of Bachelor of Science in Journalism, at the department of " + Communication + ".");
    }
}
