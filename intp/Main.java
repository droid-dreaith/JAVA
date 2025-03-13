public class Main {
    public static voide main(String[] args) {
    Product shirt = new Product("Shirt", 19.99, 5);
    double totalCost = shirt.calculateTotalCost();
    String productInfo =shirt.IntroduceProduct();
    
    System.out.println("Total Cost: $ " + totalCost);
    System.out.println(productInfo);
    
    System.out.println(shirt);
    }
    }