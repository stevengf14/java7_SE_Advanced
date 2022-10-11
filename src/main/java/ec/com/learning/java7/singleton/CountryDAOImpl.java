package ec.com.learning.java7.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class CountryDAOImpl {

    public static CountryDAOImpl instance = null;
    private List countries = null;
    
    private CountryDAOImpl(){
        
    }

    public static CountryDAOImpl getInstance() {
        if (instance == null) {
            instance = new CountryDAOImpl();
        }
        return instance;
    }

    

    public List getCountries() {
        if (countries == null) {
            countries = new ArrayList<>();
            Country p = new Country("Ecuador");
            Country p1 = new Country("Argentina");
            Country p2 = new Country("Mexico");
            Country p3 = new Country("Colombia");

            countries.add(p);
            countries.add(p1);
            countries.add(p2);
            countries.add(p3);
        }
        return countries;
    }

}
