public class Main {
    public static void main(String[] args) {
        Author prohorenok = new Author("Николай", "Прохорёнок");
        Book basicOfJava = new Book("Основы Java", 2019, prohorenok);
        Author vasilev = new Author("Алексей", "Васильев");
        Book progOnJavaForJunior = new Book("Программирование на Java для начинающих", 2021, vasilev);
        Author sierra=new Author("Kathy","Sierra");
        Book studyOfJava= new Book("Изучаем Java",2013,sierra);

        basicOfJava.setYearOfEdition(2021);
        progOnJavaForJunior.setYearOfEdition(2022);
        studyOfJava.setYearOfEdition(2022);
        System.out.println(basicOfJava);
        System.out.println(progOnJavaForJunior);
        System.out.println(studyOfJava);
    }
}