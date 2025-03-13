public class Sandwich { // CLASS NAME
    private String mainIngredient = "Tuna";
    private String breadType = "Wheat";
    private double price = 4.99;

    public Sandwich() {
        this.mainIngredient = "Tuna";
        this.breadType = "Wheat";
        this.price = 4.99;
    }
    //METHODS:

    public String getMainIngredient() {
        return mainIngredient;
    }
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }
    public String getBreadType(){
        return breadType;
    }
    public void setBreadType(String breadType){
        this.breadType = breadType;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
