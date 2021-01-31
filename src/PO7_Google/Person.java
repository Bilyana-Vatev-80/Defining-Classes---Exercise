package PO7_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String personName;
    String car;
    String company;
    String companyDepartment;
    double salary;

    private List <Pokemon> pokemonList;
    private List <Parent> parentList;
    private List <Child> childList;

    public Person (String personName){
        this.personName = personName;
        pokemonList = new ArrayList<>() ;
        parentList = new ArrayList<>();
        childList = new ArrayList<>();
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCompanyDepartment(String companyDepartment) {
        this.companyDepartment = companyDepartment;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public List<Parent> getParentList() {
        return parentList;
    }

    public List<Child> getChildList() {
        return childList;
    }
}
