public class MathMetods {
    public static void main(String[] args) {
        System.out.println("Hello world я Анна");
        //areaCircle(-2.36);
    }

    public static double areaCircle(double radius) {
        if (radius <= 0) {
            throw new ArithmeticException("Radius has value: " + radius + ". Radius must more than 0!");
        }
        final double PI = 3.14;
        double result = PI * radius * radius;
        return result;
    }

    public static double areaSquare(double side) {
        if (side <=0) {
            throw new ArithmeticException("Side has value: " + side +". Side must more than 0!");
        }
        double result = side * side;
        return result;
    }

    public static double areaTriangle(double weight, double height) {
        if (weight <= 0 |height <=0) {
            throw new ArithmeticException(String.format("Parameters has value: %f, %f. Parameters must more than 0!", weight, height));
        }
        double result = weight*height/2;
        return result;
    }
}
