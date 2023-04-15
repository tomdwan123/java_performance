package com.phucdevs.copy_objects;

public class Person {

    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Person(Person person) {
        this(
                person.getFirstName(),
                person.getLastName(),
                new Address(person.getAddress())
            );
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() {
        Person person;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            person = new Person(
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAddress()
            );
        }

        person.address = (Address) this.getAddress().clone();
        return person;
    }
}
