public class HourlyEmployee extends Employee implements Discountable{

    private final double DISCOUNT = .10;

    @Override
    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public HourlyEmployee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - calcDiscount(clothing));
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return  clothing.getPrice() * getDISCOUNT();
    }





    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "discount=" + getDISCOUNT() +
                '}';
    }


}
