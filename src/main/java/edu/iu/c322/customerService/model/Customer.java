package edu.iu.c322.customerService.model;

import java.util.Objects;

public class Customer {
    private int id;


    private String email;
    private String name;

    public void setAge(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && email.equals(customer.email) && name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, name);
    }





}
