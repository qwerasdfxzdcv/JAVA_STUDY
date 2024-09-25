import gtest.Food;
import gtest.Order;
import gtest.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //String[] str = {"h","e","l","l","o"}; //array 배열 길이가 선언시 정해진다
        //가변적으로 사용하고 싶을시 list 를 사용한다 list 는 길이가 가변적이다.
        // <type> 제네릭
        Order<String> order = new Order<>(1000,"응애"); //"응애"는 String <String>
        System.out.println(order);
        System.out.println(order.getData().length());
        Order<Food> order1 = new Order<>(10,new Food("고기")); //Food 들어가니깐 new Food()
        System.out.println(order1);
        order1.getData().eat();
        Order<Product> order2 = new Order<>(10000,new Product("tv")); //Product 들어가니깐 new Product()
        System.out.println(order2);
        order2.getData().sound();
        //List 종류가 두가지
        List<Integer> list1 = new ArrayList<>();
        //List<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        System.out.println(list1.get(0)); //list1 의 인덱스0번의 값
        System.out.println(list1.size()); // 길이 출력
        list1.remove(0);
        System.out.println(list1);
        System.out.println(list1.size()); // 길이 출력

        //          AL      LL    비교
        //create   win
        //read     win
        //delete            win
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(2);
        int target = 9;
        int[] answer = new int[2];
    /*  시간복잡도가 구리다 못해 똥냄새나는 이중 for 문
        for(int i=0;i<list.size();i++) {
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+ list.get(j) ==target){
                    answer[0] = list.get(i);
                    answer[1] = list.get(j);
                    break;
                }
            }
        }
        //안에 있는 수 2개 더해서 target 이 되어야함
        System.out.println(Arrays.toString(answer));
    */
        //"1 <= list 안의 수 <= 10, answer 는 순서를 보장하지 않음"이라는 추가 조건
        Integer[] tmp = new Integer[11];
        for(int i=0;i<list.size();i++) {
            int num = list.get(i);
            if(tmp[num] == null) tmp[num] = i;
        }
        for(int i=1;i<tmp.length;i++) {
            if(tmp[i]==null)continue;
            if(tmp[target-i]!=null){
                if(tmp[i]>tmp[target-i]){
                    answer[0] = target-i;
                    answer[1] = i;
                }
                else{
                    answer[1] = target-i;
                    answer[0] = i;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}