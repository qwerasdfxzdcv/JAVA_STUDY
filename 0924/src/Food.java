import java.util.Arrays;
// 햄버거 5600원 재료는 빵, 패티, 샐러드
//print()만들어서 "이 음식은 햄버거로 가격은 5600원입니다. 재료로는 빵, 패티, 샐러드 가 존재합니다." 출력
public class Food {
    String name;
    int price;
    String[] jaeryu;
    public String getJaeryu() {
        String a;
        a = Arrays.toString(jaeryu);
        a = a.replace("]","").replace("[","");
        return a;
    }
    public void print(){
        System.out.println("이 음식은 햄버거로 가격은 " + price + "원입니다. 재료로는 " + getJaeryu() + "가 존재합니다.");
    }
}
