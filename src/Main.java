public class Main {
    public static void main(String[] args) {
        //再輸入0前不停止
        while (true){
            //主頁控制
            Main_Options();
            //getInteger 是偵測數字範圍並回傳
            int option = FunctionLib.getIntegerRange("Enter a number between 0 and 4: ", 0, 4);
            if (option == 1){
                cakeMenu();
            } else if (option == 2) {
                customerMenu();
            } else if (option == 3) {
                orderMenu();
            } else if (option == 4) {
                reportsMenu();
            }else {
                break;
            }
        }
        System.out.println("Thank you for using the Cake Ordering System!");
    }
    public static void Main_Options() {
        // print out options
        System.out.println("Test");
        System.out.println("*** Main Menu ***");
        System.out.println("1. Manage Cakes");
        System.out.println("2. Manage Customers");
        System.out.println("3. Manage Orders");
        System.out.println("4. Generate Reports");
        System.out.println("0. Quit");
    }
    public static void cakeMenu() {
        // print out Cake options
        System.out.println("");
        System.out.println("** Cake Menu **");
        System.out.println("1. Create Cake");
        System.out.println("2. Update Cake");
        System.out.println("3. Delete Cake");
        System.out.println("4. View all Cakes");
        System.out.println("5. Back to Main Menu");
    }
    public static void customerMenu() {
        // print out customerMenu options
        System.out.println("");
        System.out.println("** Customer Menu **");
        System.out.println("1. Add Customer");
        System.out.println("2. Edit Customer");
        System.out.println("3. Remove Customer");
        System.out.println("4. View all Customers");
        System.out.println("5. Back to Main Menu");
    }
    public static void orderMenu() {
        // print out orderMenu options
        System.out.println("");
        System.out.println("** Order Menu **");
        System.out.println("1. Make an Order");
        System.out.println("2. Cancel an Order");
        System.out.println("3. View all Orders");
        System.out.println("4. Back to Main Menu");
    }
    public static void reportsMenu() {
        // print out reportsMenu options
        System.out.println("");
        System.out.println("** Reports Menu **");
        System.out.println("1. Generate Orders report by Date");
        System.out.println("2. Generate Orders report by Cake");
        System.out.println("3. Generate Orders report by Customer");
        System.out.println("4. Generate total number of Orders");
        System.out.println("5. Back to Main Menu");
    }
}
