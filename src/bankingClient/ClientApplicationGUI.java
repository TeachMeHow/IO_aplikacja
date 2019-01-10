import java.util.Scanner;

public class ClientApplicationGUI{

    public static void main(String[] args) {
       System.out.println("\t\tWITAMY W NASZEJ APLIKACJI BANKOWEJ"); 
       System.out.println("\t\t----------------------------------"); 
       System.out.println("\t\t\tCo chcialbys zrobic?");
       System.out.println("1.Sprawdz Stan Konta\t\t\t\t2.Zloz Wniosek"); 
       System.out.println("3.Sprawdz Oferte\t\t\t\t4.Zrealizuj przelew"); 
        
       TransferMenu tMenu = new TransferMenu();
       Scanner input = new Scanner(System.in);

       int choice = input.nextInt();

       switch (choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                tMenu.main_Loop();
                break;
       } 

       

    }
}
class TransferMenu{
    String address;
    String name;
    String surname;
    String title;
    String accountNumber;
    String amount;
    public void main_Loop(){
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\tPodaj dane adresata...");
        //Thread.sleep(1000);
        System.out.println("\nImie...");
        name = input.next();
        System.out.println("\n...Nazwisko...");
        surname = input.next();
        System.out.println("\n...Adres...");
        address = input.next();
        System.out.println("\nTytul...");
        title = input.next();
        System.out.println("\nPodaj numer konta...");
        accountNumber = input.next();
        System.out.println("\nKwota...");
        amount = input.next();
    }
}