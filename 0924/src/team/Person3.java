package team;
//상속=> extends 키워드로 Animal 에 있는 모든 것들을 받아와서 사용

public class Person3 extends Animal {
    private boolean isAdult;
    public Person3(String name, int age) {
        //super로 받아온다
        super(name, age);
        this.isAdult = age > 19;
    }
    @Override
    public void sound(){
        System.out.println("하이");
    }

    @Override
    public String toString() {
        return "Person3{ " +
                "age = " + getAge() +
                " name = " + getName() +
                " isAdult=" + isAdult +
                " }";
    }
}
