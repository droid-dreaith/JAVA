// BSBiology.java

public class BSBiology extends Person {

    private String Natural_Sciences;

    public BSBiology(String name, int age, int studentNum, String gender, int tuition, String Natural_Sciences) {
        super(name, age, studentNum, "BSBiology", gender, tuition);
        this.Natural_Sciences = Natural_Sciences;
    }

    @Override
    public void organization() {
        System.out.println(getName() + " is currently taking Bachelor of Science in Biology at the " + Natural_Sciences + " department.");
    }
}
