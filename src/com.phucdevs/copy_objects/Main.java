package com.phucdevs.copy_objects;

public class Main {

    public static void main(String[] args) {
        //shallowCopyObject();
        deepCopyObject();
    }

    private static void shallowCopyObject() {
        Address address = new Address("Ton Dan", "HCM", "District 4");
        Person originalPerson = new Person("Mr", "Tony", address);
        Person copingPerson = new Person(
                originalPerson.getFirstName(),
                originalPerson.getLastName(),
                originalPerson.getAddress()
        );

        System.out.println("Before change value: " + copingPerson);
        address.setStreet("Tran Hung Dao");

        System.out.println("After change value: " + copingPerson);
    }

    private static void deepCopyObject() {
        copingConstructorObject();
        cloningEnableInterfaceObject();
    }

    private static void copingConstructorObject() {
        Address address = new Address("Ton Dan", "HCM", "District 4");
        Person originalPerson = new Person("Mr", "Tony", address);
        Person copingPerson = new Person(originalPerson);

        System.out.println("Before change value: " + copingPerson);
        address.setStreet("Tran Hung Dao");

        System.out.println("After change value: " + copingPerson);
        System.out.println("After change value: " + originalPerson);
    }

    private static void cloningEnableInterfaceObject() {
        Address address = new Address("Ton Dan", "HCM", "District 4");
        Person originalPerson = new Person("Mr", "Tony", address);
        Person copingPerson = (Person) originalPerson.clone();

        System.out.println("Before change value: " + copingPerson);
        address.setStreet("Tran Hung Dao");

        System.out.println("After change value: " + copingPerson);
        System.out.println("After change value: " + originalPerson);
    }
}
