import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
         /*
            map : 데이터를 뽑아올 때 내가 원하는 key로 뽑아오는 것!
            key와 value의 조합을 가진다.
            get(key)로 value를 뽑아올 수 있다.
            map의 key도 Set의 일종이기 때문에 중복이 될 수 없다!!
            동일한 key에 다른 value를 가진 걸 put 하면 기존에 있던 key의 value를 update함
                    => update하면 안될걸 update하게 되는 상황이 생길 수 있음 : 위험함 ( key 중복 검사 필요 )
        */
        Map<String,String> map = new HashMap<>();
        map.put("qwer", "123");
        map.put("asdf", "zxcv");
        String qwe = map.get("qwer");
        System.out.println(qwe); //123 출력
        Set<String> key = map.keySet();
        System.out.println(key); // key 값들 출력
    }
}
