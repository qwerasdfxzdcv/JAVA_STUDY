public class Main {
    public static void main(String[] args) {
        //우재남, 서종호, 김석필 이름과 각각의 나이 30, 23, 비공개
        String[] names = {"우재남","서종호","김석필"};
        //int[] ages = {30,23}; 이런식으로 적으면 각각의 나이를 알수가 없음
        Integer[] ages = {30, 23, null};
        //기본형 int가 아닌 참조형 Integer로 선언시 null사용 가능
        Person person = new Person();
        person.name = "최승혁";
        person.age = 19;
        //아래 두줄은 같은방식으로 출력됨
        System.out.println(person.toCustumString());
        person.print();

        Food food = new Food();
        food.name = "햄버거";
        food.price = 5600;
        food.jaeryu = new String[] {"빵", "패티", "샐러드"};
        food.print();
    }
}
