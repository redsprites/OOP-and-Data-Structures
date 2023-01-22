public abstract class Animal implements OrganicObject, MovingObject {
    int age;

    public Animal(){

    }
    public Animal(int age) {
        this.age = age;
    }

    //    we need to say abstract for every method we have in our abstract class
    public abstract void sound();
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
