// BSAccounting.java

public class BSAccounting extends Person {

    private String Business;

    public BSAccounting(String name, int age, int studentNum, String gender, int tuition, String Business) {
        super(name, age, studentNum, "BSAccounting", gender, tuition);
        this.Business = Business;
    }

    @Override
    public void organization() {
        System.out.println(getName() + " is currently taking Bachelor of Science in Accounting at the " + Business + " department.");
    }
}
