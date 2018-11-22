package main;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import dao.*;
import dao.passenger.IPassengerDAO;
import dao.passenger.PassengerDAO;
import dao.login.ILoginDAO;
import dao.login.LoginDAO;
import service.*;
import service.login.ILoginService;
import service.login.LoginService;
import service.passenger.IPassengerService;
import service.passenger.PassengerService;

public class DigitalLibrarySingleton {

    private ILoginService loginService;
    private ICitiesService citiesService;
    private IPassengerService carsService;
    private DigitalLibrarySingleton(){

        MongoClient m1 = new MongoClient("localhost", 27017);
        DB db = m1.getDB("digitalLib");

        ILoginDAO loginDAO = new LoginDAO(db);
        loginService = new LoginService(loginDAO);

        ICitiesDAO citiesDAO =new CityDAO(db);
        citiesService = new CitiesService(citiesDAO);

        IPassengerDAO carsDAO = new PassengerDAO(db);
        carsService = new PassengerService(carsDAO);
    }

    public static DigitalLibrarySingleton getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private static final DigitalLibrarySingleton instance = new DigitalLibrarySingleton();
    }

    public ILoginService getLoginService(){return loginService;}
    public ICitiesService getCitiesService(){return citiesService;}
    public IPassengerService getCarsService() {return carsService;}

}
