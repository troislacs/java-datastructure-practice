package hashmap;

import java.util.HashMap;
import java.util.Objects;

class Address{
    String streetNo;
    String city;

    public Address(String streetNo, String city) {
        this.streetNo = streetNo;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return streetNo.equals(address.streetNo) &&
                city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetNo, city);
    }
}

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap =new HashMap<>();
        myMap.put(1, "A");
        myMap.put(2, "B");

        //it like a dictionary in C#

        HashMap<String, String> zipCodes = new HashMap<>();
        zipCodes.put("J4M", "Southshore");

        HashMap<String, Address> mapAddress = new HashMap<>();
        mapAddress.put("TTTTTT", new Address("22", "Longueuil"));
    }
}
