// BSinformationTech.java

public class BSinformationTech extends Person {

    private String CICS;

    public BSinformationTech(String name, int age, int studentNum, String gender, int tuition, String CICS) {
        super(name, age, studentNum, "BSInformationTech", gender, tuition);
        this.CICS = CICS;
    }

    @Override
    public void organization() {
        System.out.println(getName() + " is currently taking Bachelor of Science in Information Technology at the " + CICS + " department.");
    }
}
