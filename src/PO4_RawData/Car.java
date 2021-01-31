package PO4_RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int engine;
    private int cargo;
    private List <String> tires;

    public Car(String model,int engine,int cargo){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = new ArrayList<>();
    }
}
