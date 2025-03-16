// Person.java

public abstract class Person {

    private String name;
    private int age;
    private int studentNum;
    private String course;
    private String gender;
    private int tuition;

    public Person(String name, int age, int studentNum, String course, String gender, int tuition) {
        this.name = name;
        this.age = age;
        this.studentNum = studentNum;
        this.course = course;
        this.gender = gender;
        this.tuition = tuition;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public String getCourse() {
        return course;
    }

    public String getGender() {
        return gender;
    }

    public int getTuition() {
        return tuition;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student Number: " + studentNum);
        System.out.println("Course: " + course);
        System.out.println("Gender: " + gender);
        System.out.println("Tuition: " + tuition);
    }

    public abstract void organization();
}
