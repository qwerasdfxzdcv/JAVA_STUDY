package team;

public class Person {
    // class 틀
//     team.Person 틀 이름
    // 안에서 갖는 변수 = 필드

    //getter 와 setter 를 통해 public 으로 바꾸지 않고도 값을 읽을수 있도록 함
    public String getName() {
        return name;
    }
    //setter 를 쓸시 수정이 너무 자유로워짐 -> 수정하는 함수를 따로 제작하는게 더 좋음
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    String name;
    int age;
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
