package service;
import cafe.Coffee;
import java.util.IllegalFormatWidthException;
import static global.Data.coffees;
// service 유저의 입력으로 나의 로직을 처리하는 곳
public class CafeService {
    public void coffeeAdd(String[] strings){
        try{
            Coffee coffee = Coffee.of(strings);
            coffees.add(coffee);
        }catch(NumberFormatException e){
            System.out.println("가격 똑바로 입력 바람.");
        }catch(IllegalFormatWidthException e){
            System.out.println("타입 똑바로 입력 바람.");
        }
    }
}
