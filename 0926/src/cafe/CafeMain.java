package cafe;
import controller.CafeController;

import static global.Data.coffees;
import static global.Utills.sc;

import java.util.*;
public class CafeMain {
    public static void main(String[] args) {
        CafeController cafeController1 = null;
        System.out.println("데이터를 입력하시겠습니까? 그렇다면 1을 입력하십시오.");
        int c = Integer.parseInt(sc.nextLine());
        if(c==1){
            cafeController1 = CafeController.getInstance();
            for (int i = 0; i < coffees.length; i++) {
                cafeController1.addCoffee(i);
            }
        }

        // 만약 위에서 1을 입력하고 또 입력한다 했을 경우
        System.out.println("또 입력하실래요");
        CafeController cafeController2 = null;
        int c1 = Integer.parseInt(sc.nextLine());
        if(c1==2){
            cafeController2 = CafeController.getInstance(); // 위에서 썼던 cafeController1과 똑같은 곳에서 불러와다 cafeController2에 집어넣음?
            for (int i = 0; i < coffees.length; i++) {
                cafeController2.addCoffee(i);
            }
        }

        for(Coffee coffee : coffees) System.out.println(coffee);
        System.out.println("===================");
        System.out.println(cafeController1);
        System.out.println(cafeController2);
        System.out.println("===================");

    }
}
