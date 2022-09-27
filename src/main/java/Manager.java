public class Manager extends Employee {


    private final double discount = .25;

    public Manager(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }


//    @Override
//    public void printEmpPriceAfterDisc() {
//
//    }


    @Override
    public String toString() {
        return "Manager{" +
                "discount=" + discount +
                '}';
    }


    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {

    }
}
