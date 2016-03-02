/**
 * Created by CMelanson on 2/3/16.
 */
public class Address {
    String street;
    String state;
    String zip;
    String city;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
