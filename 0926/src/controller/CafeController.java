package controller;

import cafe.Coffee;
import java.util.*;
import static global.Data.coffees;
import static global.Utills.sc;

public class CafeController {
    public static CafeController getInstance() {
        if(cafeController == null){ //cafeController가 생성된적이 없으면
            cafeController = new CafeController();  //새로 생성합니다.     => 생성된적이 있다면 새로 생성하지 않음
        }
        return cafeController;  // 리턴합니다. (만약 기존에 cafeController가 있었다면 기존의 것을 바로 리턴함)
    }

    private static CafeController cafeController;

    private CafeController(){
    }

    public void addCoffee(int i){
        System.out.println("메뉴 "+(i+1)+"의 정보를 입력하세요. (이름, 가격, 판매계절, 카테고리 순 / 요소는 공백으로 구분합니다.)");
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        try{
            Coffee coffee = Coffee.of(strings);
            coffees[i] = coffee;
        }catch(NumberFormatException e){
            System.out.println("가격 똑바로 입력 바람.");
            i--;
        }catch(IllegalFormatWidthException e){
            System.out.println("타입 똑바로 입력 바람.");
            i--;
        }
    }
}
