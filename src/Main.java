public class Main {
    public static void main(String[] args) {
        Author lermantov = new Author( "михаил", "лермантов");
        Author tolstoy = new Author("Лев","толстой");

        Book mcyri = new Book("Мцыри"), publishingYear 1863, lermantov);
        Book warAndPeace = new Book("Война и мир"), publishingYear 1824, tolstoy);
        }
        mcyri.printInfo();
        warAndPace.printInfo();

        mcyri.setPublishingYear(1865);

        mcyri.printInfo();

}


}