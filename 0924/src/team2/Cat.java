package team2;
// 클래스 상속은 extends interface 는 implements
public class Cat implements AnimalAction {
    private int age;
    private String name;
    public Cat(String name,int age) {
        this.age = age;
        this.name = name;
    }
    @Override
    public void sound(){
        System.out.println("고양고양");
    }
    @Override
    public void eat(){
        System.out.println("야금야금");
    }
}
