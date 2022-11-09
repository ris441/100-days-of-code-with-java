package Input_Output_Day2;

public class Output{
    public static void output(String str){
        System.out.println("This is Output String Function "+ str);
    }
    public static void main(String[] args) {
        int a=12;
        System.out.println("The value of a : "+ a);
        
        // String is class name and variable name is declared as class name;
        String String = "Hello, String";
        System.out.println(
            "The String value : "+String
        );

        // Print in the Single line 
        System.out.print("Square of "+a);
        System.out.print("is a X a = "+a*a);

        // Printf in java
        // find the area of rectangle
        int side = 24;
        System.out.printf("The area of rectangle = %d\n",side*side);
        // find area of circle 
        System.out.printf("Here pi= %.3f and radius=%.3f The area of circle = %.3f\n",3.13434f,2.565344f,3.14*2.5*2.5);

        float radius = 3.8945f;
        final float PI = 3.147654f;
        double ans= (double)radius*PI*radius; 
        System.out.print(((double)radius));
        System.out.print(" \n"+ ans+"\n");
 
        System.out.print(((Object)(double)radius).getClass().getName());
        System.out.print(" \n"+ ((Object)ans).getClass().getName()+"\n");
        System.out.println(((Object)radius).getClass().getSimpleName());

    }
}