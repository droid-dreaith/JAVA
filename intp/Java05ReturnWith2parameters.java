public class Java05ReturnWith2parameters {
    
    public static int cry(int x,int y){
        return x - y;
    }
    public static void main(String[] args) {
        int z = cry(5,3);
        System.out.println(z);
    }
}