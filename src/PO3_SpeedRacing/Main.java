package PO3_SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map <String,Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
          String[] tokens = scanner.nextLine().split("\\s+");
          String model = tokens[0];
          int fuel = Integer.parseInt(tokens[1]);
          double consumption = Double.parseDouble(tokens[2]);

          Car car = new Car(model,fuel,consumption);//obekt
          cars.put(model,car);
        }
        String input = " ";
        while (!"End".equals(input = scanner.nextLine())){
            String model = input.split("\\s+")[1];
            int distanceToDrive = Integer.parseInt(input.split("\\s+")[2]);

            Car carToDrive = cars.get(model);
            if(!carToDrive.drive(distanceToDrive)){
                //не може да караме
                System.out.println("Insufficient fuel for the drive");
            }
        }
        for (Car car : cars.values()) {
            System.out.println(car.toString());
        }
    }
}
