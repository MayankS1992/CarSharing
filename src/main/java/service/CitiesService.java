package service;

import dao.ICitiesDAO;

import java.util.List;


public class CitiesService implements ICitiesService {
    ICitiesDAO citiesDAO;

    public CitiesService(ICitiesDAO citiesDAO) { this.citiesDAO = citiesDAO; }

    /**
     * @return List of Cities in the Country
     */
    @Override
    public List fetchCities() {
        return citiesDAO.fetchCities();
    }
}
