public class Product {

    private static final int MINIMUM_PRICE = 30000;

    private String name;

    private int price;

    private String option;

    public Product(String name, int price, String option) {

        this.name = name;
        this.price = price;
        this.option = option;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getOption() {
        return option;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOption(String option) {
        this.option = option;
    }


}
