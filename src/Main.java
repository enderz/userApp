import AppLayer.Users;
import ControllerLayer.UsersController;
import DataLayer.UserDb;
import UILayer.UsersView;

public class Main {

    public static void main(String[] args) {

        Users usersModel = new Users();
        UsersView usersView = new UsersView();
        UserDb usersDb = new UserDb();
        UsersController usersController = new UsersController(usersModel, usersView, usersDb);

        usersController.usersMenuController ();
    }
}