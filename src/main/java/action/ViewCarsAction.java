package action;

import com.opensymphony.xwork2.ActionSupport;
import entities.Trip;
import main.DigitalLibrarySingleton;

/**
 * To View available Journeys available for share for a given set of
 * origin and destination
 */
public class ViewCarsAction extends ActionSupport {
    DigitalLibrarySingleton singleton = DigitalLibrarySingleton.getInstance();
    Trip trip = new Trip();
    String origin;
    String destination;
    @Override
    public String execute() throws Exception {
       // singleton.getCarsService().viewCarPools(origin,destination);
        return SUCCESS;
    }
}
