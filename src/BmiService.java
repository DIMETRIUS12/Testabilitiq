public class BmiService {
    public int calculate(double a, double b) {
        double weight = a;
        double height = b * b;
        double index = weight / height;
        return (int) index;
    }
}
