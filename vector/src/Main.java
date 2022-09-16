import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyVector a = new MyVector(2.0, 2.1, -3.5);
        MyVector b = new MyVector(2.0, -1.1, 2.9);
        int N = 2;

        System.out.println("Vector A: " + a);
        System.out.println("Vector B: " + b);
        System.out.println("Length of vector A: " + dblToStr(a.length()));
        System.out.println("Sum of vectors A and B: " + a.sum(b));
        System.out.println("Difference of vectors A and B: " + a.diff(b));
        System.out.println("Dot product of vectors A and B: " + dblToStr(a.dotProduct(b)));
        System.out.println("Cross product of vectors A and B: " + a.crossProduct(b));
        System.out.println("Angle between vectors A and B (in radians): " + dblToStr(a.angle(b)));
        System.out.println("Angle between vectors A and B (in degrees): " + dblToStr(a.angle(b) * 180 / Math.PI));
        System.out.println("Array of "+ N + " random vectors:");
        System.out.println(Arrays.toString(MyVector.getRandomVectorsArray(N)));



        }
    private static String dblToStr(double x){
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(x).replace(',','.');
    }
}