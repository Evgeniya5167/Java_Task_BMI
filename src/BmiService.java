public class BmiService {
    public double calculate(double weight, double hight) {
        double bodyMassIndex = weight / (hight * hight);
        return bodyMassIndex;
    }
}
