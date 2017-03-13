package AppLayer;

import java.util.ArrayList;

/**
 * Created by jonb on 12/03/17.
 */
public class Users
{
    private ArrayList<User> userArrayList;

    public Users()
    {
        this.userArrayList = new ArrayList<User>();
    }

    public void addUser(User userObject)
    {
        userArrayList.add(userObject);
    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }
}