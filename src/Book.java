public class Book {
    private String name;
    private int yearOfEdition;
    private Author author;

    public Book (String name, int yearOfEdition, Author author) {
        this.name = name;
        this.yearOfEdition = yearOfEdition;
        this.author = author;
    }
    public String getName() {
        return this.name;
    }
    public int getyearOfEdition() {
        return this.yearOfEdition;
    }
    public void setyearOfEdition(int yearOfEdition) {
        this.yearOfEdition = yearOfEdition;
    }
    public Author getAuthor (){
        return this.author;
    }
    @Override
    public String toString() {
        return "Название книги: " + this.name + ". Год издания: " + this.yearOfEdition + " " + this.author.toString();
    }
}