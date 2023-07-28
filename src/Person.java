public class Person {
    String firstName;
    String lastName;
    String city;
    String state;
    String email;
    int zip;

    public Person(String firstName, String lastName, String city, String state, String email, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip ;
    }
}
