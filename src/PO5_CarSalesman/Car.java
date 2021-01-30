package PO5_CarSalesman;

public class Car {
    private String model;
    private String engineModel;
    //optional
    private int weight;
    private String color;

    //1.  -> model,engineModel
    //2.  -> model,engineModel,weight,color
    //3.  -> model,engineModel,weight
    //4.  -> model,engineModel,color

    public Car (String model,String engineModel){
        this.model = model;
        this.engineModel = engineModel;
        this.weight = 0;
        this.color = "n/a";
    }
    public Car (String model,String engineModel,int weight,String color){
        this(model,engineModel);
        this.weight = weight;
        this.color = color;
    }
    public Car (String model,String engineModel,int weight) {
        this(model, engineModel);
        this.weight = weight;
        this.color = "n/a";
    }
    public Car (String model,String engineModel,String color) {
        this(model, engineModel);
        this.color = color;
        this.weight = 0;
    }
    public String getModel(){
        return this.model;
    }
    public String getEngineModel (){
        return this.engineModel;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getColor (){
        return this.color;
    }
}
