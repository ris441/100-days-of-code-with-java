import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JVM_Working {
    public static void main(String[] args) {

        Student s1 = new Student();
        Class c1 = s1.getClass();
        // getName is method in side the Class package that will return the type of object .
        System.out.println(c1.getName());

        Method m1[]=c1.getDeclaredMethods();
        for (Method method : m1) {
            System.out.println(method.getName());
        }
        Field f1[] = c1.getDeclaredFields();
        for (Field field : f1) {
            System.out.println(field.getName());
        }
        
    }
}

class Student{
    private String name;
    private int roll;
    public String getSName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRoll(){
        return this.roll;

    }
    public void setRoll(int roll){
        this.roll = roll;
    }
}