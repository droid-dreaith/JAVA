// BSJournalism.java

public class BSJournalism extends Person {

    private String Communication;

    public BSJournalism(String name, int age, int studentNum, String gender, int tuition, String Communication) {
        super(name, age, studentNum, "BSJournalism", gender, tuition);
        this.Communication = Communication;
    }

    @Override
    public void organization() {
        System.out.println(getName() + " is currently taking Bachelor of Science in Journalism at the " + Communication + " department.");
    }
}
