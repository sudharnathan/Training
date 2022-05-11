abstract class Abstractexample1{
    //declaring abstract method without implementation
    public abstract void show();
    public abstract void print();
}//extending abstract class
public class Abstractexample extends Abstractexample1{

    @Override
    //implementing abstract method of abstract class
    public void show() {
        System.out.println("Showing Abstract");
    }

    @Override
    public void print() {
        System.out.println("Printing Abstract");
    }
}