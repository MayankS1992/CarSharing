package dao;

import com.mongodb.*;
import dao.daoUtility.IMongoDatabaseUtility;
import dao.daoUtility.MongoDatabaseUtility;

import java.util.List;

public class CityDAO implements ICitiesDAO {
    DB database;
    IMongoDatabaseUtility listOfCities = new MongoDatabaseUtility();

    public CityDAO(DB db) {
        database = db;
    }

    /**
     * @return
     */
    @Override
    public List fetchCities() {
       return listOfCities.getListValues(database,"cities","city");
    }
}
