package basic.constructor;

public class Book {
    String title;
    String author;
    int page;

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(){
        this("", "");
    }
    Book(String title, String author){
        this(title, author, 0); // 생성자 내에서만, 생성자의 첫 줄에서만 호출 가능! 다른 메서드에선 호출 불가
    }

    public void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
