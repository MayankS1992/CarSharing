package dao.login;

import com.mongodb.DBCursor;
import entities.User;

public interface ILoginDAO {

    DBCursor getUserDetails(User user);

    boolean registerUser(User user);
}
