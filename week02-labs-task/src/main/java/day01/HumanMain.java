package day01;

public class HumanMain {
    public static void main(String[] args) {
        Human man = new Human("Péter", 22);
        System.out.println(man.getName());
        System.out.println(man.getAge());

        System.out.println(man.introduction());
    }
}
