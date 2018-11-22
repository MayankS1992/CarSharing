package action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.ValidationAwareSupport;
import entities.User;
import main.DigitalLibrarySingleton;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.interceptor.SessionAware;
import utilities.Constants;
import javax.servlet.http.HttpSession;
import java.util.Map;

@ParentPackage(value = "json-default")
public class LoginAction extends ActionSupport implements Constants, SessionAware, ModelDriven<User> {
    /*Input Parameters from FrontEnd*/
    private String id;
    private String pwd;

    private User user = new User();
    private final ValidationAwareSupport validationAware = new ValidationAwareSupport();
    private Map<String, Object> session = null;
    DigitalLibrarySingleton digitalLibrarySingleton = DigitalLibrarySingleton.getInstance();

    /*Return values for JSP*/
    public String message;
    public String page;
    /**
     * Method to Login User into Portal
     * @return message, page
     */
    @Override
    public String execute() throws NullPointerException{
        // check for user session existence
        HttpSession currentSession = ServletActionContext.getRequest().getSession(true);
        // cast object to user object
        User getSessionAttr = (User) currentSession.getAttribute(LOGGED_IN_USER);
        user.setEmail(getId());
        user.setPassword(getPwd());
        String action = null;
             if (getSessionAttr != null) {
                 action = SUCCESS;
             }
             else if (user.getEmail() == null || user.getEmail().trim().equals("")) {
                 validationAware.addActionError("Email cannot be left blank");

             } else if (user.getPassword() == null || user.getPassword().trim().equals("")) {
                 validationAware.addActionError("Password cannot be left blank");
             } else {
                 Boolean loginStatus = digitalLibrarySingleton.getLoginService().login(user);
                 if (loginStatus){
                     session.put(LOGGED_IN_USER, user);
                     message= "Successful";
                     action = SUCCESS;
                 }
                 else if(loginStatus.equals(false)){
                     message = "Failure";
                     action = INPUT;
                 }
             }
            return action;
    }

    public String getId() {return id;}

    public String getMessage() {return message;}

    public String getPage() {return page;}

    public void setId(String id) {this.id = id;}

    public String getPwd() {return pwd;}

    public void setPwd(String pwd) {this.pwd = pwd;}

    public User getUser() {return user;}

    public void setUser(User user) {this.user = user;}

    public void setSession(Map<String, Object> map) {this.session = map;}

    @Override
    public User getModel(){return user;}
}
