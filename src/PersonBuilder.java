public class PersonBuilder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    public PersonBuilder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    // Metodo per costruire l'oggetto Person
    public Person build() {
        return new Person(this);
    }
    // Metodo per stampare le informazioni della persona
    @Override
    public String toString() {
        return "Person{" +
                "firstName = " + firstName +
                ", lastName =" + lastName  +
                ", age = " + age +
                ", address =" + address +
                '}';
    }
}
