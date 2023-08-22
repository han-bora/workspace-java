package kr.co.himedia.classfycodewithclass.after;

public class main {

    public static void main(String[] args) {
        item book = new item(item.CASSIFYCODE_BOOK, "죄와벌", 20000);
        item dvd = new item(item.CASSIFYCODE_DVD, "도스토예프스키", 40000);
        item software = new item(item.CASSIFYCODE_SOFTWARE, "chatGPT", 30000);

        System.out.println(book);
        System.out.println(dvd);
        System.out.println(software);

    }
}
