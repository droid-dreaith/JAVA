public class Java07MethodOverloading {
    static int plusMethod(int x,int y){
        return x + y;
    }

    static double plusMethod(double x,double y){
        return x+y;
    }
    static int minusMethod(int x,int y){
        return x - y;
    }
    static double minusMethod(double x,double y){
        return x-y;
    }
    static int multiplyMethod(int x,int y){
        return x * y;
    }
    static double multiplyMethod(double x,double y){
        return x*y;
    }
    static int divideMethod(int x,int y){
        return x / y;
    }
    static double divideMethod(double x,double y){
        return x/y;
    }
    public static void main(String []args){
        int num1 = plusMethod(8,5);
        double num2 = plusMethod(4.3,6.26);
        System.out.println("\n=====ADDITION=============\nint: "+num1);
        System.out.println("double: "+num2 + "\n");
        int num3 = minusMethod(8,5);
        double num4 = minusMethod(4.3,6.26);
        System.out.println("\n=====SUBTRACTION=============\nint: "+num3);
        System.out.println("double: "+num4);
        int num5 = multiplyMethod(8,5);
        double num6 = multiplyMethod(4.3,6.26);
        System.out.println("\n=====MULTIPLICATION===========\nint: "+num5);
        System.out.println("double: "+num6);
        int num7 = divideMethod(8,5);
        double num8 = divideMethod(4.3,6.26);
        

    }
}