package action;

import com.opensymphony.xwork2.ActionSupport;
import entities.Trip;
import entities.User;
import main.DigitalLibrarySingleton;


public class CarPoolingAction extends ActionSupport {
    String username;
    String tripID;
    User user = new User();
    Trip trip = new Trip();
    DigitalLibrarySingleton singleton = DigitalLibrarySingleton.getInstance();
    @Override
    public String execute() throws Exception {

        Boolean seatBook = singleton.getCarsService().requestCarPool(username,tripID);
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }
}
