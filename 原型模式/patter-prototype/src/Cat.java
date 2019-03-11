import java.io.Serializable;

public class Cat implements  Cloneable {
    private String name;

    private int age;

    public Cat(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone(){
        Cat c=null;
        try{
            c= (Cat) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return c;
    }
}
