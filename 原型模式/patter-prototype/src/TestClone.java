public class TestClone {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setAge(10);
        c.setName("tom");


       Cat b = (Cat)c.clone();
        System.out.println(c.getName());
        b.setName("jack");
        System.out.println(b.getName());

    }
}
