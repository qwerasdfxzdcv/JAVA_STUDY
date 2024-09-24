package team2;
//상속=> extends 키워드로 Animal 에 있는 모든 것들을 받아와서 사용

public class Person3 implements AnimalAction {
    private boolean isAdult;
    private int age;
    private String name;
    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
        this.isAdult = age>19;
    }
    @Override
    public void sound(){
        System.out.println("하이");
    }
    @Override
    public void eat(){
        System.out.println("냠냠");
    }
}
