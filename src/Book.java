public class Book {

    private String title;
    private int publishingYear;
    private Author author;

    public Book(String title, int publishingYear, Author author) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;

    }
    public void printInfo()
    System(mcyri);
        System.out.println(warAndPeace);

    private static void print(Book Book){
        System.out.println("Название книги" + getTitle() + ", год издания: " + getPublishingYear() + ",автор: " + Book.getAuthor().getName() + "" + Book.getAuthor().getSurname());


