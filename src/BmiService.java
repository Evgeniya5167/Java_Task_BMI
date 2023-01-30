public class BmiService {
    public double calculate(double weight, double hight) {
        double BodyMassIndex = weight / (hight * hight);
        return BodyMassIndex;
    }
}
