package ec.com.learning.java7.synchronized_;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class CountryDAOImpl {

    public static CountryDAOImpl instance = null;
    private List countries = null;

    private CountryDAOImpl() {

    }

    public static synchronized CountryDAOImpl getInstance() {
        synchronized (Main.class) {
            if (instance == null) {
                instance = new CountryDAOImpl();
                System.out.println("Instance created");
            }
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
