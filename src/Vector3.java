import java.util.Vector;

public class Vector3 {
    private double x, y, z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double DotProduct(Vector3 other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector3 VectorProduct(Vector3 other) {
        double a = this.x * other.y - this.y * other.x;
        double b = this.y * other.z - this.z * other.y;
        double c = this.z * other.x - this.x * other.z;
        return new Vector3(a, b, c);
    }

    public Vector3 Add(Vector3 other) {
        return new Vector3(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector3 Substract(Vector3 other) {
        return new Vector3(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public double Module(Vector3 other) {
        return Math.sqrt(this.x * other.x + this.y * other.y + this.z + other.z);
    }

    public double AngleBetweenTwo(Vector3 other) {
        return Math.acos((this.x * other.x + this.y * other.y + this.z * other.z) / (Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) +
                Math.pow(this.z, 2)) * Math.sqrt(Math.pow(other.x, 2) + Math.pow(other.y, 2) + Math.pow(other.z, 2))));
    }

    @Override
    public String toString() {
        return "Vector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Vector3 vector1 = new Vector3(1, 2, 3);
        Vector3 vector2 = new Vector3(13, 17, 5);

        System.out.println("Dot product:");
        System.out.println(vector1.DotProduct(vector2));

        System.out.println("Vector Product:");
        System.out.println(vector1.VectorProduct(vector2));

        System.out.println("Vectors sum:");
        System.out.println(vector1.Add(vector2));

        System.out.println("Vectors Substracted");
        System.out.println(vector1.Substract(vector2));

        System.out.println("Vector 1 module");
        System.out.println(vector1.Module(vector1));

        System.out.println("Vector 2 module");
        System.out.println(vector2.Module(vector2));

        System.out.println("Angle between 2 vectors");
        System.out.println(vector1.AngleBetweenTwo(vector2));
    }
}
