import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class App {
        public static Scanner scanner = new Scanner(System.in);
        private static final List<Phone> phones = new ArrayList<>();

        public static void start(){
        try{
                while(true) {
                        System.out.println(" =============================================");
                        System.out.println("|           Phone Management Program          |");
                        System.out.println("|                                             |");
                        System.out.println("| Select function by number to continue:      |");
                        System.out.println("|                                             |");
                        System.out.println("| 1. Add new Phone                            |");
                        System.out.println("| 2. Delete                                   |");
                        System.out.println("| 3. Display list phone                       |");
                        System.out.println("| 4. Search                                   |");
                        System.out.println("| 6. Exit                                     |");
                        System.out.println("|                                             |");
                        System.out.println(" =============================================");
                        System.out.println(" Select function : ");
                        int choice = scanner.nextInt();
                        scanner.nextLine();


                        switch (choice) {
                                case 1:
                                addNewPhone();
                                        break;
                                case 2:
                                deletePhone();
                                        break;
                                case 3:
                                 displayListPhone();
                                        break;
                                case 4:
                                searchPhone();
                                        break;
                                case 5:
                                        System.out.println("Thank you for using the program ! ");
                                        System.exit(0);
                                        break;
                                default:
                                        System.out.println("Invalid selection. Please select again!");
                        }
                }
                }catch(Exception e){
                        System.out.println(e.getMessage());
                }
        }
        private static void addNewPhone(){

                System.out.println("Enter name phone :");
                String name = scanner.nextLine();
                System.out.println("Enter price :");
                int price = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter producer : ");
                String producer = scanner.nextLine();

                Phone newPhone = new Phone (producer,  quantity,  price,  name);
                phones.add(newPhone);
                List<String> phoneList = new ArrayList<String>();
                for(Phone phone : phones){
                        phoneList.add(phone.toString());
                }
                WriteFile.write(phoneList);
                System.out.println("The Phone has been added successfully!");

        }

        private static void deletePhone(){
                System.out.println("Enter id ");
                int id = scanner.nextInt();
                int index = 0;
                for (int i =0 ; i < phones.size(); i++){
                        if (id == i){
                                index = i-1;
                                break;
                        }
                }
                phones.remove(index);
                System.out.println("The phone with id " + id + " removed successfully!");
        }

        private static void displayListPhone(){
                if(phones.isEmpty()){
                        System.out.println("No phones");
                }else {
                        System.out.println("Phone :");
                        for (Phone phone : phones){
                                System.out.println(phone);
                        }
                }

        }
        private static void searchPhone(){
                System.out.println("Enter id ");
                int id = scanner.nextInt();
                int index = 0;
                for (int i =0 ; i < phones.size(); i++){
                        if (id == i){
                                index = i -1;
                                break;
                        }
                }
                System.out.println(phones.get(index));
        }

}
