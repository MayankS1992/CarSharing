package service.login;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import dao.login.ILoginDAO;
import entities.User;

import java.util.Iterator;

public class LoginService implements ILoginService {
    private ILoginDAO loginDAO;

    public LoginService(ILoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }


    /**
     * Used to Validate user data
     *
     * @param user credentials
     * @return
     */
    public boolean login(User user)  {
        DBCursor userAuthCursor = loginDAO.getUserDetails(user);
        Iterator<DBObject> fields = userAuthCursor.iterator();
        while(fields.hasNext()){
            String password = (String) fields.next().get("password");
            if(password.equals(user.getPassword()))
            {return true;}
        }
        return false;
    }

    /**
     * To Register a A new User
     * @param user
     * @return
     */
    @Override
    public boolean register(User user) {
        return loginDAO.registerUser(user);
    }
}
