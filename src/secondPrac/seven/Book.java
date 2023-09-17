package secondPrac.seven;

public class Book {
    private String name;
    private String title;
    private int age;
    private String type;
    public  Book(String type){
        this.type = type;
    }
    public void showType(){
        System.out.println("Type is " + type);
    }
    public Book(){}
    public Book(String name, String title, int age) {
        this.name = name;
        this.title = title;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                '}';
    }
}
