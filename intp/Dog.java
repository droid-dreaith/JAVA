class Dog {

    public static void main(String[] args) {
        // Create Dog objects with different attributes
        Dog dog1 = new Dog("Pel", "Labrador Retriever", 3); // Create a dog named Buddy
        Dog dog2 = new Dog("Lex", "German Shepherd", 2); // Create a dog named Max
        // Test the bark() and greet() methods for each dog
        dog1.bark(); // Make dog1 bark
        dog1.greet("Ace"); // Greet Alice
        dog2.bark(); // Make dog2 bark
        dog2.greet("Andrea");
        // Test the play() method for each dog
        dog1.play(); // Simulate dog1 playing
        dog2.play(); // Simulate dog2 playing
    }
    //attributes
    private String name;
    private String breed;
    private int age;

    //define a constructor method 
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark ()
    {
        System.out.println(name + "Woof! Woof!");
    }
    public void greet(String personName) {
        System.out.println("Hello! My name is " + name + " and i am "+ breed);
    }
    public void play(){
        System.out.println("I am playing with my owner");
    }




}