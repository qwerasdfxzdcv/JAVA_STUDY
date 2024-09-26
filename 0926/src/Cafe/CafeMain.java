package Cafe;
import static global.Data.coffees;

import java.util.*;
public class CafeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Coffee[] coffees = Data.coffees;

        // 꽉 차면 끝내고 메뉴 하나씩 출력
        for(int i=0;i< coffees.length;i++){
            System.out.println("메뉴 "+(i+1)+"의 정보를 입력하세요. (이름, 가격, 판매계절, 카테고리 순 / 요소는 공백으로 구분합니다.)");
            String s = sc.nextLine();
            String[] strings = s.split(" ");

            try{
                Coffee coffee = Coffee.of(strings);
                coffees[i] = coffee;
            }catch(NumberFormatException e){
                System.out.println("가격 입력은 숫자만");
                i--;
            }catch(IllegalArgumentException e){
                System.out.println("계절 혹은 카테고리 입력 똑바로");
                i--;
            }

        }
        for(Coffee coffee : coffees) System.out.println(coffee);
    }
}
