public class Main {
    public static void main(String[] args) {

        Clothing clothing1 = new Clothing("Black Hoodie with pockets",10.00,'M');
        Clothing clothing2 = new Clothing("Light Blue, Denim pants",15.00,'S');
        Clothing clothing3 = new Clothing("Red T shirt",7.00,'L');



        Clothing [] managerCart = new Clothing[]{clothing1,clothing2,clothing3};
        Manager manager1 = new Manager("Saad",managerCart,'L');

        Clothing[] employeeCart = new Clothing[]{clothing1,clothing2,clothing3};
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Tom",employeeCart,'M');

        System.out.println(ShopApp.calcTotal(managerCart));

        System.out.println();

        ShopApp.printEmployeeName(hourlyEmployee1);
        ShopApp.printEmployeeName(manager1);

        System.out.println(ShopApp.isAFit(manager1,clothing2));
    }
}
