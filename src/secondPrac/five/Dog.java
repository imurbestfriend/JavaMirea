package secondPrac.five;

public class Dog {
    private String name;
    private int age;

    public Dog(){

    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void humanAge(){
        System.out.println(age*7);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
