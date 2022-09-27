import java.util.ArrayList;

public class ShopApp {

    public static double calcTotal(Clothing[] clothing) {
        int sum = 0;
        for(int i = 0; i < clothing.length; i++){
            sum += clothing[i].getPrice();

        }
        return sum;
    }

    public static boolean isAFit(Customer customer, Clothing clothing){
        if(customer.getSize() != clothing.getSize()){
            return false;
        }
        return true;
    }

   // public static void sortAndPrintClothingByPrice(ArrayList<Clothing>){


   // }

    public static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());
    }

//    public static void printDiscAmtOff(Discountable[], Clothing){
//
//
//    }

}
