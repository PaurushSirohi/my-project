public class MenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        
        switch (choice) {
            case 1:
                System.out.println("You selected option 1."); 
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            case 4:
                System.out.println("You selected option 4.");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                System.out.println("Thank you for using our services.");
        }
    }
}