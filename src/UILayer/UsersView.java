package UILayer;

import AppLayer.User;
import AppLayer.Users;

import java.util.Scanner;

/**
 * Created by jonb on 12/03/17.
 */
public class UsersView
{
    public void showUsers(Users usersObject)
    {
        for (User userObject: usersObject.getUserArrayList())
        {
            System.out.printf("Bruger: %s, kodeord: %s%n",userObject.getUserName(), userObject.getUserPassword());
        }
    }

    public User inputUserCredentials()
    {
        String userLogin;
        String kodeord;
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast brugerlogin (email): ");
        userLogin = input.next();
        System.out.println("Indtast kodeord: ");
        kodeord = input.next();

        User userObject = new User(userLogin, kodeord);

        return userObject;
    }

    public int usersMenu()
    {
        Scanner input = new Scanner(System.in);

        int choice = 1;

        do
        {
            System.out.println("***** Menu ******");
            System.out.println("1) Login user");
            System.out.println("2) Show logged-in users");
            System.out.println("3) Exit");
            choice = input.nextInt();
        }  while (choice < 1 && choice > 3);

        return choice;
    }

    public void usersValidationResult(boolean isValidLogin)
    {
        if (isValidLogin)
        {
            System.out.println("Godkendt brugerlogin og kodeord");
        }
        else
        {
            System.out.println("Ikke godkendt");
        }
    }
}