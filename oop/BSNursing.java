// BSNursing.java

public class BSNursing extends Person {

    private String Health_and_Medicine;

    public BSNursing(String name, int age, int studentNum, String gender, int tuition, String Health_and_Medicine) {
        super(name, age, studentNum, "BSNursing", gender, tuition);
        this.Health_and_Medicine = Health_and_Medicine;
    }

    @Override
    public void organization() {
        System.out.println(getName() + " is currently taking Bachelor of Science in Nursing at the " + Health_and_Medicine + " department.");
    }
}
