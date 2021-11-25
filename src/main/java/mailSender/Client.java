package mailSender;

import java.util.LinkedList;

public class Client {
    private static int i = 0;
    private int id;
    private String name;
    private int age;
    private Sex sex;
    private String email;

    public Client(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = i++;
        LinkedList<Integer> arr = new LinkedList<>();

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }
}
