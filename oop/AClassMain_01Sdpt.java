public class Main_Person {

    public static void main(String[] args) {
        //object creation
        Product  x = new Product();

        Person p = new Person();
        Person p1 = new Person();
        p.firstName = "John";
        p.lastName = "Doe";
        p.sex = 'M';
        p.age = 19;

    
         p1.firstName = "Alenere";
         p1.lastName = "Doe";
         p1.sex = 'F';
         p1.age = 30;

        System.out.println(p.firstName + " " + p.lastName + " ");
        System.out.println(p1.firstName + " " + p1.lastName + " ");
        System.out.println(p.sex + " " + p.age);
        System.out.println(p1.age + " " + p1.sex);

        

  }
}