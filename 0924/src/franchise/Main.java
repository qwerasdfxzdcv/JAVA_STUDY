package franchise;

public class Main {
    public static void main(String[] args) {

        StoreAction store = new Store("매머드",9,19);
        Food menu1 = new Food("아메리카노",1000);
        Food menu2 = new Food("라떼",2000);
        Food menu3 = new Food("라떼는 말이야",20000);
        store.addMenu(menu1);
        store.addMenu(menu2);
        store.addMenu(menu3);
        store.removeMenu("라떼");
        store.print();
    }
}