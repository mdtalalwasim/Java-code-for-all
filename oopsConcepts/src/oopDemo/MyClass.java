package oopDemo;

abstract public class MyClass {

    //complete method
    public void calculate(){
        System.out.println("calculating the results...");
    }

    //abstract method -1
    abstract public void lunchRocket();

    //abstract method -2
    abstract public void lunchJet();


    public static void main(String[] args) {
        //MyClass obj = new MyClass();
        MyClass myClassChild = new MyClassChild();
        myClassChild.lunchRocket();
        myClassChild.lunchJet();
    }
}
