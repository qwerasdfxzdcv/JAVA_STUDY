package team;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void sound(){
        System.out.println("고양고양");
    }
}
