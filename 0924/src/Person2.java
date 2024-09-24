public class Person2 {
    String name;
    int age;
    //생성자(constructor) 직접 만들기
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //이미 존재하는것을 바꾸는 것을 overriding 이라고 함
    @Override
    public String toString() { //이미 존재하던 toString 을 바꾼 것
        return "이름 : " + name + "(" + age + ")";
    }
    //이름은 같지만 아규먼트를 다르게 설계해서 재사용성을 늘리는 이런 방식을 overloading 이라고 한다.
    //이름만 넣고 나이를 비공개로 하고싶을때 아래 생성자를 사용
    public Person2(String name) {
        this.name = name;
    }
    //반대로 이름은 비공개 나이만 공개일때 사용
    public Person2(int age) {
        this.name = "비공개";
        this.age = age;
    }
}