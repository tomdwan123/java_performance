package com.phucdevs.copy_objects;

public class Address {

    private String street;
    private String city;
    private String county;

    public Address(String street, String city, String county) {
        this.street = street;
        this.city = city;
        this.county = county;
    }

    public Address(Address address) {
        this(address.getStreet(), address.getCity(), address.getCounty());
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                '}';
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Address(
                    this.getStreet(),
                    this.getCity(),
                    this.getCounty()
            );
        }
    }
}
