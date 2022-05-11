interface Multiabstractexample1{
    public abstract void show2();
}
interface Multiabstractexample2 extends Multiabstractexample1{
    public abstract void print2();
}
public class Multiabstractexample implements Multiabstractexample2{

    @Override
    public void show2() {
        System.out.println("Interface abstract showing");
    }

    @Override
    public void print2() {
        System.out.println("Interface abstract printing");
    }
}
