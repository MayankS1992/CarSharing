package service.login;

import entities.User;

import java.net.UnknownHostException;

public interface ILoginService {

    /**
     * Used to Validate user data
     * @param user credentials
     * @return
     */
    boolean login(User user);

    /**
     *
     * @param user
     * @return
     */
    boolean register(User user);
}
