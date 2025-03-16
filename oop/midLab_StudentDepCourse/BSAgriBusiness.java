
public class BSAgriBusiness extends Person {

    private String Agriculture;

    public BSAgriBusiness(String name, int age, int studentNum, String gender, double tuition, String Agriculture) {
        super(name, age, studentNum, "BSAgriBusiness", gender, tuition);
        this.Agriculture = Agriculture;
    }

    @Override
    public void Organization() {
        System.out.println(getName() + " is currently taking the course of Bachelor of Science in Agriculture Business, at the department of " + Agriculture + ".");
    }
}
