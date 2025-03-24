public class Lab_1_1 {
    public static void main(String[] args) {

        final double a = 2.27;
        final double b = 1.18;
        final double c = 3.92;
        final double x = 0.78;

        double y = Math.pow((a/(b * Math.pow(x,2)+1) + c * Math.pow(x,3) + b * Math.pow(Math.sin(x),2)),2 );

        System.out.println("Значение b: " + y);
    }
}