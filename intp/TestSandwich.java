public class TestSandwich {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        
        System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread Type: " + sandwich.getBreadType());
        System.out.println("Price: " + sandwich.getPrice());
    }
}