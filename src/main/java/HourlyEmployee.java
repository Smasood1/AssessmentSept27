public class HourlyEmployee extends Employee{

    private final double discount = .10;

    public HourlyEmployee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }


    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {

    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "discount=" + discount +
                '}';
    }
}
