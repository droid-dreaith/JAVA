// BSPsychology.java

public class BSPsychology extends Person {

    private String Social_Sciences;

    public BSPsychology(String name, int age, int studentNum, String gender, int tuition, String Social_Sciences) {
        super(name, age, studentNum, "BSPsychology", gender, tuition);
        this.Social_Sciences = Social_Sciences;
    }

    @Override
    public void organization() {
        System.out.println(getName() + " is currently taking Bachelor of Science in Psychology at the " + Social_Sciences + " department.");
    }
}
