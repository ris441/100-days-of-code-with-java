
// A simple enum example where enum is declared
// outside any class (Note enum keyword instead of
// class keyword)

enum Color {
    RED,
    GREEN,
    BLUE;

    private Color(){
        System.out.println("Constructor called "+ this.toString());
    }
}


public class EnumInJava {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        Color arr[] = Color.values();
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
        System.out.println(Color.valueOf("RED"));

    }
}
