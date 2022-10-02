public class AutoboxingExample {
    public Integer add(Integer a, Integer b){
        System.out.println("Im in  Integer method!");
        return a+b;
    }

    public static void  main(String[] args){
        AutoboxingExample example = new AutoboxingExample();
        int a = 5;
        int b = 10;
        example.add(a,b);
        System.out.println("Again, I am Back...hehehe!");
        System.out.println(a+b);
    }
}
