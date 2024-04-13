class vehicle{
    public void run(){
        System.out.println("Vehicle is running");
    }
    public void stand(){
        System.out.println("The vehicle is standing");
    }
}


class Car extends vehicle{
    public void run(){

        System.out.println("Car is running");
    }
    public void stand(){

        System.out.println("Car is standing");
    }
}


class Bike extends vehicle{
    public void run(){
        System.out.println("Bike is running");
    }
    public void stand(){
        System.out.println("The Bike is standing");
    }
}

class Ground{
    public void Earth(vehicle ref){ //here we are passing reference of vehicle(parent)
        ref.run(); // here we are invoking run method by using reference of parent vehicle
        ref.stand();// see the line 54 and 55 we are passing reference of Car and Bike in the ref of vehicle,
        //so after running this it will go for run and stand method which are present in class Car and Bike.

// This is called polymorphism because we are calling only one time run & stand method but this is executing from
// both the classes i.e, from class Car and Bike, Means one is to many...

        System.out.println("---------------------------------");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Let's see what happens");
        System.out.println("-------------------------");
        Car obj1=new Car();
        Bike obj2=new Bike();

//  obj1=obj2;//Error because we are trying to assign an object of type Bike to a reference variable of type Car.
        vehicle ref; //This statement declares a reference variable named ref of type vehicle.
//        ref = obj1; Assigning the object referenced by obj1 (Car object) to the reference variable ref.
//        obj1.run();
//        obj2.run();
//        ref.run();
        Ground obj3=new Ground();
        obj3.Earth(obj1);
        obj3.Earth(obj2);

    }
}
