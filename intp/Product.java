public class Product {

    private String name;
    private double price;
    private int quantity;
    
    public Product (String name,double,price,int quantity){
    
    this.name=name;
    this.price=price;
    this.quantity=quantity;
    
    }
    public double calculateTotalCpst () {
    return price = quantity;
    }
    
    public String introduceProduct() {
    return "Product" + name +",Price: $"+String.format("%.2f",price) + "Quantity : " +quantity;
    public string toString() {
    return introduceProduct();
    }
    }
    }