import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Clothing clothing1 = new Clothing("Black Hoodie with pockets",10.00,'M');
        Clothing clothing2 = new Clothing("Light Blue, Denim pants",15.00,'S');
        Clothing clothing3 = new Clothing("Red T shirt",7.00,'L');



        Clothing [] managerCart = new Clothing[]{clothing1,clothing2,clothing3};
        Manager manager1 = new Manager("Saad",managerCart,'L');

        Clothing[] employeeCart = new Clothing[]{clothing1,clothing2,clothing3};
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Tom",employeeCart,'M');

        ArrayList<Clothing> list = new ArrayList<Clothing>();
        list.add(0,clothing1);
        list.add(1,clothing2);
        list.add(2,clothing3);


        System.out.println("Printing items in array list");
        for(Clothing x : list){
            System.out.println(x);
        }


        System.out.println("\nTotal of Manager's Cart");
        System.out.println(ShopApp.calcTotal(managerCart));

        System.out.println("Checking if a clothing item fits an employee");
        System.out.println(ShopApp.isAFit(manager1,clothing2));

        System.out.println("Hourly employee price for clothing1 after discount");
        hourlyEmployee1.printEmpPriceAfterDisc(clothing1);
        System.out.println("Hourly employee price for clothing2 after discount");
        hourlyEmployee1.printEmpPriceAfterDisc(clothing2);
        System.out.println("Manager price for clothing1 after discount");
        manager1.printEmpPriceAfterDisc(clothing1);
        System.out.println("Manager price for clothing2 after discount");
        manager1.printEmpPriceAfterDisc(clothing2);

        System.out.println("\nEmployee Name:");
        ShopApp.printEmployeeName(hourlyEmployee1);
        System.out.println("Manager Name");
        ShopApp.printEmployeeName(manager1);

        Discountable[] discount = {hourlyEmployee1,manager1};
        System.out.println("Print the discount amount off");
        ShopApp.printDiscAmtOff(discount,clothing1);

        System.out.println("Sort and Print clothing by price");
        ShopApp.sortAndPrintClothingByPrice(list);
    }
}
