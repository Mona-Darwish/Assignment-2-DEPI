package loginPackage;

import java.util.Scanner;

public class SecureLoginClass {
    public static void main(String[] args) {

        String validEmail = "mohamed@intrast.com";
        String validPassword = "mohamed123";
        Scanner input = new Scanner(System.in);
        boolean isValid=false;
        for (int i = 1; i <= 3; i++) {
            System.out.println(" Please enter a valid email:");
            String userEmail = input.nextLine();
            System.out.println(" Please enter a valid password:");
            String userPassword = input.nextLine();

            if (userEmail.equals(validEmail) && userPassword.equals(validPassword)) {
                System.out.println("Welcome");
                isValid = true;
                break;
            }

              else {
            }          System.out.println("wrong email or password, you have "+(3-i)+ "chance!");}
      if (!isValid) {

         System.out.println("You are blocked");
       }
       else {
          System.out.println("Enter your code");
          final String Code;
          Code = input.nextLine();
          System.out.println("Enter your Full name:");
          String name = input.nextLine();
          System.out.println("Enter your Age:");
          int Age = input.nextInt();
          System.out.println("Enter your Grade+ ('must be between 0 to 100')");
          int Grade = input.nextInt();
          char letterGrade = 'x';
          if (Grade >= 90 && Grade <= 100) {
              letterGrade = 'A';
          } else if (Grade >= 80 && Grade <= 89) {
              letterGrade = 'B';
          } else if (Grade >= 70 && Grade <= 79) {
              letterGrade = 'C';
          } else if (Grade >= 60 && Grade <= 69) {
              letterGrade = 'D';
          } else if (Grade >= 0 && Grade <= 59) {
              letterGrade = 'f';
          } else System.out.println("Invalid Grade entered");
          System.out.println("All information:");
          System.out.println("your code=" + Code);
          System.out.println("your Full name=" + name);
          System.out.println("your age=" + Age);
          System.out.println("your Grade =" + Grade);
          System.out.println("your Grade evaluation=" + letterGrade);
      }

    }

}
