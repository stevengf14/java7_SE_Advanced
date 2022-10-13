package ec.com.learning.java7.generic;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Class<K,T,V,E> {

    private K objectK;
    private T objectT;
    private V objectV;
    private E objectE;

    public Class(K objectK, T objectT, V objectV, E objectE) {
        this.objectK = objectK;
        this.objectT = objectT;
        this.objectV = objectV;
        this.objectE = objectE;
    }

    public void showType() {
        System.out.println("K is: " + objectK.getClass().getName());
        System.out.println("T is: " + objectT.getClass().getName());
        System.out.println("V is: " + objectV.getClass().getName());
        System.out.println("E is: " + objectE.getClass().getName());
    }
    
}
