package cafe;

public class Coffee {
    private String name;
    private int price;
    private SeasonType season; // 파는 계절
    private Category category; // 커피 / 티 / 에이드

    // static : static 키워드가 붙어있는 애들은 먼저 써야하니 미리 자리 빼놔라!!
    public static Coffee of(String[] strings){
        String name = strings[0];
        int price = Integer.parseInt(strings[1]);
        SeasonType season = SeasonType.valueOf(strings[2]);
        Category category = Category.valueOf(strings[3]);

        //if(!category.equals("커피")) return null;
        return new Coffee(name, price, season, category);
    }

    private Coffee(String name, int price, SeasonType season, Category category) {
        this.name = name;
        this.price = price;
        this.season = season;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public SeasonType getSeason() {
        return season;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", season='" + season + '\'' +
                ", type='" + category + '\'' +
                '}';
    }
}
