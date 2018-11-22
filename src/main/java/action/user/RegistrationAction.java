package action.user;

import com.opensymphony.xwork2.ActionSupport;
import entities.Role;
import entities.User;
import main.DigitalLibrarySingleton;

import static entities.Role.USER;

public class RegistrationAction extends ActionSupport {
    /*Input params*/
    private String form_fullName;
    private String form_userName;
    private String form_email;
    private String form_password;
    DigitalLibrarySingleton digitalLibrarySingleton = DigitalLibrarySingleton.getInstance();

    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setFullName(form_fullName);
        user.setUsername(form_userName);
        user.setPassword(form_password);
        user.setEmail(form_email);
        user.setRole(USER);
        Boolean register = digitalLibrarySingleton.getLoginService().register(user);
        return SUCCESS;
    }

    public String getForm_fullName() {
        return form_fullName;
    }

    public void setForm_fullName(String form_fullName) {
        this.form_fullName = form_fullName;
    }

    public String getForm_userName() {
        return form_userName;
    }

    public void setForm_userName(String form_userName) {
        this.form_userName = form_userName;
    }

    public String getForm_email() {
        return form_email;
    }

    public void setForm_email(String form_email) {
        this.form_email = form_email;
    }

    public String getForm_password() {
        return form_password;
    }

    public void setForm_password(String form_password) {
        this.form_password = form_password;
    }
}
