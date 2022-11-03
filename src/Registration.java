import java.util.Scanner;

class Register {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;

    public Register(String firstName, String lastName, String userName, String password, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.emailId = emailId;
    }

    public Register() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    @Override
    public String toString() {
        return "Register [FirstName= " + firstName + ", LastName= " + lastName + ", UserName= " + userName + ", Password= " +
                password + ", EmailId= " + emailId + "]";
    }
}


public class Registration {

    static Register register = new Register();

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter firstName => ");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.print(" Enter lastName => ");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.print(" Enter userName => ");
            String userName = scanner.nextLine();
            register.setUserName(userName);

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.print(" Enter emailId => ");
            String emailId = scanner.nextLine();
            register.setEmailId(emailId);

            System.out.println("\n*****************************\n ");
            System.out.println("Registrations are successful!");
            System.out.println(register.toString());
        }
    }
}