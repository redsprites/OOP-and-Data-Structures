public abstract class Vehicle implements MovingObject, MechanicalObject{
    public Vehicle(){

    }
    public abstract void Sound();
    String model;


    public Vehicle(String model) {
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
