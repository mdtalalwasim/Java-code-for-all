
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */


class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
            
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping...");
    }
}

public class MultiLevelInheritanceEx {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.bark();
        bd.eat();
        bd.weep();
    }
}
