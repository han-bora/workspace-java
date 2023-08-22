package kr.co.himedia.classfycodewithclass.after;

public class item {

    public static final int CASSIFYCODE_BOOK = 0;

    public static final int CASSIFYCODE_DVD = 1;

    public static final int CASSIFYCODE_SOFTWARE = 2;

    private final int classifyCode;
    private final String title;

    private final int price;

    public item(int classifyCode, String title, int price) {
        this.classifyCode = classifyCode;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "item{" +
                "classifyCode=" + classifyCode +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
