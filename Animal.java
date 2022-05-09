package Inheritance1;

public class Animal {
    public void EatingHabit() {
        System.out.println("Some Animal Eats meat");
    }
    }
    class Lion extends Animal {
    public void EatingHabit () {
        System.out.println("Lion kills Deer");
    } }
    class Tiger extends Animal{
    public void EatingHabit (){
        System.out.println("Tigers kills animal");
    }}
    class Cheetah extends Animal{
    public void EatingHabit(){
        System.out.println("Fastest running animal");
    }}
class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal Lion = new Lion();
        Animal Tiger= new Tiger();
        Animal Cheetah = new Cheetah();

        myAnimal.EatingHabit();
        Lion.EatingHabit();
        Tiger.EatingHabit();
        Cheetah.EatingHabit();

    }
}
