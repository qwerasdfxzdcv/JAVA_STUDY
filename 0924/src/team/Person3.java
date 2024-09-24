package team;
//상속=> extends 키워드로 Animal 에 있는 모든 것들을 받아와서 사용

public class Person3 extends Animal {
    public Person3(String name, int age) {
        //super로 받아온다
        super(name, age);
    }
    public void talk(){
        System.out.println("ㅎㅇㅋㅋ" + getName());
    }
    @Override
    public void sound(){
        System.out.println("하이");
    }
}
