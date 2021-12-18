import java.util.Scanner;
public class UserLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username,password,tempUN,tempP;
        username = "";
        password = "";
        tempP= null;
        tempUN=null;
        while (true){

            if(username.equals("")&& password.equals("")){
                System.out.println("Set a username and password!");
                System.out.print("Please enter your username: ");
                username = input.next();
                System.out.print("Please enter your password: ");
                password = input.next();
                System.out.println("All done!");
                tempUN= username;
                tempP =password;
            }
            else{
                System.out.println("Enter username and password to login!");
                System.out.print("Please enter your username: ");
                username = input.next();
                System.out.print("Please enter your password: ");
                password = input.next();
                if(username.equals(tempUN)&&(password.equals(tempP))){
                    System.out.println("Login Success!");
                    break;
                }
                else {
                    System.out.println("Wrong Password or Username! Do you want reset?\n1-Yes\n2-No");
                    System.out.print("Selection: ");
                    int selection = input.nextInt();
                    switch (selection){
                        case 1:
                            while(true){
                                System.out.println("Enter your new password!");
                                password = input.next();
                                if(password.equals(tempP)){
                                    System.out.println("Your new password can't be same old one!");
                            }
                                else{
                                    tempP=password;
                                    break;
                                }


                            }
                            break;
                        case 2:
                            System.out.println("Password did not change! Good Bye!");
                            break;
                        default:
                            System.out.println("Good Bye!");

                    }
                }

            }

        }



    }
}
