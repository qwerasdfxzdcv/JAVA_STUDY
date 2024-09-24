package team;

public class Person {
    // class 틀
//     team.Person 틀 이름
    // 안에서 갖는 변수 = 필드
    public String name;
    public int age;
    // 메서드 method
    // public 리턴타입 메서드명(){
    //      기능 구현
    //  }
    public String toCustumString(){
        return "name : " + name + ", age : " + age;
    }
    public void print(){
        System.out.println("name : " + name + ", age : " + age);
    }
}
