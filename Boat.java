public class Boat extends Vehicle{

    //constructors
    public Boat(String brand) {
        super(brand);
    }

    

    //methods
    @Override
    public String doStuff(){
        return "Je suis " + super.getBrand() + " et je fais glou glou !";
    }
}