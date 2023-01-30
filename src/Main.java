public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 68;
        double hight = 1.6;
        double BodyMassIndex = service.calculate(weight, hight);
        System.out.println(BodyMassIndex);
    }
}