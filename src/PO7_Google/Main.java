package PO7_Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        Map <String,Person> peoples = new HashMap<>();

        while (!"End".equals(input)){
            String[] tokens = input.split("\\s+",3);
            String personName = tokens[0];
            String object = tokens[1];
            String objectName = tokens[2];

            peoples.putIfAbsent(personName,new Person(personName));
            switch (object){
                case "company":
                    String[] companyDetails = objectName.split("\\s+");
                    peoples.get(personName).setCompany(companyDetails[0]);
                    peoples.get(personName).setCompanyDepartment(companyDetails[1]);
                    peoples.get(personName).setSalary(Double.parseDouble(companyDetails[2]));
                    break;
                case "car":
                    peoples.get(personName).setCar(objectName);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon (objectName);
                    peoples.get(personName).getPokemonList().add(pokemon);
                    break;
                case "parents":
                    Parent parent = new Parent(objectName);
                    peoples.get(personName).getParentList().add(parent);
                    break;
                case "children":
                    Child child = new Child(objectName);
                    peoples.get(personName).getChildList().add(child);
                    break;
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        System.out.println(input);
        System.out.println("Company:");
        if(peoples.get(input).company != null){
            System.out.printf("%s %s %.2f%n",peoples.get(input).company,peoples.get(input).companyDepartment,
                    peoples.get(input).salary);
        }
        System.out.println("Car:");
        if(peoples.get(input).car != null){
            System.out.println(peoples.get(input).car);
        }
        System.out.println("Pokemon:");
        if(!peoples.get(input).getPokemonList().isEmpty()){
            for (Pokemon pokemon : peoples.get(input).getPokemonList()) {
                System.out.println(pokemon.getPokemonName());

            }
        }
        System.out.println("Parents:");
        if(!peoples.get(input).getParentList().isEmpty()){
            for (Parent parent: peoples.get(input).getParentList()) {
                System.out.println(parent.getParentName());

            }
        }
        System.out.println("Children:");
        if(!peoples.get(input).getChildList().isEmpty()){
            for (Child child: peoples.get(input).getChildList()) {
                System.out.println(child.getChildName());

            }
        }
    }
}
