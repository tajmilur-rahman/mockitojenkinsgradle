public class Driver {
    public static void main(String[] args) {
        CalculateCommission calculate = new CalculateCommission();
        System.out.println("Commission: " + calculate.getCommission(5, 5, 5));
    }
}