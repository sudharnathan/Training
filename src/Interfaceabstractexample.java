interface Abstractexample3 {

    public abstract void show1();
    public abstract void print1();
}
public class Interfaceabstractexample implements Abstractexample3{


    @Override
    public void show1() {
        System.out.println("Showing Abstract");
    }

    @Override
    public void print1() {
        System.out.println("Printing Abstract");
    }
}