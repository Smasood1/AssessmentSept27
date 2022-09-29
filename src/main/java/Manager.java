public class Manager extends Employee implements Discountable{


    private final double DISCOUNT = .25;

    public Manager(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }


    @Override
    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "discount=" + getDISCOUNT() +
                '}';
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {

        System.out.println(clothing.getPrice() - calcDiscount(clothing));
    }

    @Override
    public double calcDiscount(Clothing clothing) {
       return  clothing.getPrice() * getDISCOUNT();
    }




}
