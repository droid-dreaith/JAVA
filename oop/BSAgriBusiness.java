// BSAgriBusiness.java

public class BSAgriBusiness extends Person {

    private String Agriculture;

    public BSAgriBusiness(String name, int age, int studentNum, String gender, int tuition, String Agriculture) {
        super(name, age, studentNum, "BSAgriBusiness", gender, tuition);
        this.Agriculture = Agriculture;
    }

    @Override
    public void organization() {
        System.out.println(getName() + " is currently taking Bachelor of Science in AgriBusiness at the " + Agriculture + " department.");
    }
}
