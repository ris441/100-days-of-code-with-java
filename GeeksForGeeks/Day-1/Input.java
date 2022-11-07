import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    // Your code here
		    int number = sc.nextInt();
		    float decif=sc.nextFloat();
		    long numl=sc.nextLong();
		    byte numb=sc.nextByte();
            sc.nextLine();
            String s = sc.nextLine();
            
		    System.out.println(number);
		    System.out.println(decif);
		    System.out.println(numl);
		    System.out.println(numb);
		    
            System.out.println(s);
		    
		    
		}
		
    }
    }
    

