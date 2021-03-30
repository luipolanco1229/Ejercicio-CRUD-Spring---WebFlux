package com.sofka.demo.model;

public class Person {

    private Integer idPerson;
    private String name;


    public Person(Integer idPerson, String name) {
        this.idPerson = idPerson;
        this.name = name;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person [idPerson= " + idPerson +" , nombre =  "+ name +"]";
    }
}
