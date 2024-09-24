import franchise.Food;
import team.*;

public class Main {
    public static void main(String[] args) {
        //우재남, 서종호, 김석필 이름과 각각의 나이 30, 23, 비공개
        //String[] names = {"우재남","서종호","김석필"};
        //int[] ages = {30,23}; 이런식으로 적으면 각각의 나이를 알수가 없음
        //Integer[] ages = {30, 23, null};
        //기본형 int 가 아닌 참조형 Integer 로 선언시 null 사용 가능
        Person person = new Person();
        person.setName("최승혁");
        person.setAge(19);
        //아래 두줄은 같은방식으로 출력됨
        System.out.println(person.toCustumString());
        person.print();

//        Food food = new Food();
//        food.name = "햄버거";
//        food.price = 5600;
//        food.jaeryu = new String[] {"빵", "패티", "샐러드"};
//        food.print();

        Team team = new Team();
        team.goal = "착하게 살자";
        team.teamName = "아메리카노";
        Person2 p1 = new Person2("김",18);
        Person2 p2 = new Person2("박");
        Person2 p3 = new Person2(20);
        Person2 p4 = new Person2("김",18);
        //기본생성자를 사용하면 아래처럼 하나하나 넣어줘야함
        /*
        p1.name = "김";
        p1.age = 18;
        p2.name = "박";
        p2.age = 19;
        p3.name = "최";
        p3.age = 20;
        */
        team.members = new Person2[]{p1, p2, p3, null};
        Person2 p = new Person2("이현숙",26);
        p.name = "이현숙";
        p.age = 26;
        team.memberAdd(p); // 이현숙(26)을 추가
        team.memberRemove("김"); //이름이"김"인 멤버를 삭제
        team.print();
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1); // p1.toString()으로 자동실행
        Person3 p0 = new Person3("뿡",22);
        System.out.println(p0.getName()+"("+p0.getAge()+")");
        p0.sound();
        Cat cat = new Cat("야옹",1);
        cat.sound();
        System.out.println(p0);
    }
}
