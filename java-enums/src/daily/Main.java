package daily;

public class Main {

    public static void main(String[] args) {
        Pizza testPz = new Pizza();
        testPz.setStatus(Pizza.PizzaStatus.READY);
        assert testPz.isDeliverable();
        testPz.printTimeToDeliver();

        double x = 1.0;
        double y = 2.0;
        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n ", x, op, y, op.apply(x, y));
        }
    }
}
