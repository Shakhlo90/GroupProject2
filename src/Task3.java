public class Task3 {


    /*Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which should be returning
    a price of the car.Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
    in which returned price is calculated as following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount. The Sedan class has field as length and also
    does it is own implementation of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
    */
    public static void main(String[] args) {
        Sedan sedan = new Sedan(35000, "White", 14.7);
        System.out.println("Sedan total price is " + sedan.carPrice + " and its discounted price is " + sedan.calculateSalePrice());

        Truck truck = new Truck(120000, "White", 1000);
        System.out.println("Truck total price is " + truck.carPrice + " and its discounted price is  " + truck.calculateSalePrice());
    }
}

abstract class Car {
    double carPrice;
    String color;

    Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;

    }

    abstract double calculateSalePrice();
}


class Truck extends Car {
    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    double calculateSalePrice() {

        if (weight > 2000) {
            return carPrice - (10 * carPrice / 100);
        } else {
            return carPrice - (20 * carPrice / 100);

        }

    }
}


class Sedan extends Car {
    double legnth;

    Sedan(double carPrice, String color, double legnth) {
        super(carPrice, color);
        this.legnth = legnth;
    }

    double calculateSalePrice() {

        if (legnth > 20) {
            return carPrice - (5 * carPrice / 100);
        } else {
            return carPrice - (10 * carPrice / 100);


        }
    }
}

