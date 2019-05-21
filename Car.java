public class Car extends Vehicle{

    //constructors
    public Car(String brand) {
        super(brand);
    }

    

    //methods
    @Override
    public String doStuff(){
        return "Je suis " + super.getBrand() + " et je fais vroum vroum !";
    }
}