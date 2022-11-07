import java.util.Scanner;

//fix
// fix

public class Login {

    static boolean login = false;
    static int optionSelected;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select 1 for Login");
        System.out.println("Select 2 for User Registration"); // den her skal tilkobles til Registration classen
        System.out.println("Select 3 to Exit");
        optionSelected = scanner.nextInt();

        if (optionSelected == 1) {
            System.out.println("Login in progress\n");
        } else if (optionSelected == 2) {
            // proceed with registration
            System.out.println("Registration in progress\n");
        }else if (optionSelected == 3) {
            System.out.println("Exit");
        }


        String username, password;
        username = "De flotte drenge";
        password = "As1234";

        Scanner scan = new Scanner(System.in);

        while (!login) {
            System.out.print("Please Enter Your Name: ");
            username = scan.nextLine();

            System.out.print("Please Enter Your password: ");
            password = scan.nextLine();

            if (username.equals("De flotte drenge") && password.equals("As1234")) {
                System.out.println("\nAccess accepted!");
                System.out.println("Welcome To TextFlix!");
                login = true;

            } else {
                System.out.println("User name or Password is incorrect!");
                System.out.println("Please try again!");


            }
        }


    }
}

