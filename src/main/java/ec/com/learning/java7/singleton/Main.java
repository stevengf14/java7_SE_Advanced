package ec.com.learning.java7.singleton;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public static void main(String[] args) {
        CountryDAOImpl dao = CountryDAOImpl.getInstance();
        // java 8
        //dao.getCountries().stream().map(x -> ((Country)x).getName()).forEach(System.out::println);

        for (Object obj : dao.getCountries()) {
            System.out.println(((Country) obj).getName());
        }
        System.out.println("*************************");
        for (Object obj : dao.getCountries()) {
            System.out.println(((Country) obj).getName());
        }
        System.out.println("*************************");
        CountryDAOImpl dao1 = CountryDAOImpl.getInstance();
        for (Object obj : dao1.getCountries()) {
            System.out.println(((Country) obj).getName());
        }
    }

}
