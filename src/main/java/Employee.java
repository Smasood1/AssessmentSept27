public abstract class Employee extends Customer{




    private final double discount = .10;


    public Employee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    public double getDiscount() {
        return discount;
    }

    public abstract void printEmpPriceAfterDisc(Clothing clothing);


}
