package franchise;


public class Store implements StoreAction{
    private String name;
    private int openTime;
    private int closeTime;
    private Food[] menus;
    private double averagePrice;
    private int menuCount;
    private long totalPrice;
    public Store(String name, int openTime, int closeTime) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.totalPrice = 0;
        this.menuCount = 0;
        this.menus = new Food[5];
    }
    public double calTotalPrice() {
        double total = 0;
        for(int i = 0; i < menus.length; i++){
            if(menus[i] != null) {
                total += menus[i].price;
            }
        }
        return total;
    }
    public double calAveragePrice() {
        double average = calTotalPrice() / menuCount;
        return average;
    }
    @Override
    public void print() {
        System.out.println("가게이름: " + name);
        System.out.println("열리는 시간: " + openTime);
        System.out.println("닫는 시간: " + closeTime);
        System.out.print("메뉴 목록: " + getMenuArr());
        System.out.println(" ");
        System.out.println("메뉴 개수: " + menuCount);
        System.out.println("전체 가격: " + calTotalPrice());
        System.out.println("평균 가격: " + calAveragePrice());

    }
    /*
        가게 이름 : 매머드
         열리는 시간 : 9
          닫는 시간 19
           메뉴는 아메리카노, 라떼
            평균 가격은 1500
            메뉴는 총 2개
            메뉴의 총 가격은 3000원 입니다.
         */


    @Override
    public boolean addMenu(Food menu) {
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] == null) {
                menus[i] = menu;
                totalPrice += menu.price;
                menuCount++;
                break;
            }
        }
        return false;
    }

    @Override
    public boolean removeMenu(String name) {
        for (int i = 0; i < menus.length; i++) {
            if(menus[i]!=null) {
                if (menus[i].menuName.compareTo(name) == 0) {
                    totalPrice -= menus[i].price;
                    menus[i] = null;
                    menuCount--;
                }
            }
        }
        return false;
    }

    @Override
    public String getMenuArr() {
        String menuArr = "";
        for(int i = 0; i < menus.length; i++) {
            if(menus[i]==null){
                menuArr += "빈 메뉴\n";
            }else menuArr += menus[i].menuName + "(" + menus[i].price + "원) ";
        }
        return menuArr;
    }
}