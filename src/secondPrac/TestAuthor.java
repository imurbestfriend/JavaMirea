package secondPrac;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author( "Mike","mail.ru", 'M');
        author.setEmail("yandex.ru");
        System.out.println(author);
        System.out.println(author.getName() + " " + author.getEmail() + " " + author.getGender());
    }
}
