import java.text.DecimalFormat;

public class MyVector {
    double x;
    double y;
    double z;

    MyVector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return Math.sqrt( x*x + y*y + z*z );
    }

    public double dotProduct(MyVector v){
        return x*v.x + y*v.y + z*v.z;
    }

    public MyVector crossProduct(MyVector v){
        double newX = y * v.z - z * v.y;
        double newY = z * v.x - x * v.z;
        double newZ = x * v.y - y * v.x;
        return new MyVector(newX, newY, newZ);
    }

    public double angle(MyVector v){
        double lenThis = this.length();
        double lenV = v.length();
        if (lenV == 0 || lenThis == 0){
            return 0;
        }
        return Math.acos( this.dotProduct(v) / (lenV * lenThis) );
    }

    public MyVector sum(MyVector v){
        return new MyVector(x + v.x, y + v.y, z + v.z);
    }

    public MyVector diff(MyVector v){
        return new MyVector(x - v.x, y - v.y, z - v.z);
    }

    public static MyVector[] getRandomVectorsArray(int N){
        MyVector[] vectorsArr = new MyVector[N];
        for (int i = 0; i < N; i++) {
            vectorsArr[i] = new MyVector(Math.floor(Math.random() * 19 - 9), Math.floor(Math.random() * 19 - 9), Math.floor(Math.random() * 19 - 9));
        }
        return  vectorsArr;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "[" + df.format(x).replace(',','.') + "; " + df.format(y).replace(',','.') + "; " + df.format(z).replace(',','.') +"]";
    }

}
