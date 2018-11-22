package action.cities;

import com.opensymphony.xwork2.ActionSupport;
import main.DigitalLibrarySingleton;

import java.util.ArrayList;
import java.util.List;


public class CitiesAction extends ActionSupport {
    DigitalLibrarySingleton singleton = DigitalLibrarySingleton.getInstance();
    List cities = new ArrayList();

    /**
     * To load the list of cities
     * @return
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        cities = singleton.getCitiesService().fetchCities();
        if(cities.size()>0)
            return SUCCESS;
        else
            return ERROR;
    }

    public List getCities() {
        return cities;
    }
}
