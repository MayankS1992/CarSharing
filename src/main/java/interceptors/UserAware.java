package interceptors;


import entities.User;

public interface UserAware {
    void setUser(User user);
}