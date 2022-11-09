public class SwitchEnum {
enum weekname {  MONDAY, TUESDAY, WEDNESDAY,THURSDAY,FRIDAY,SATURDAY, SUNDAY}
    public static void main(String[] args) {
        weekname[] wk = weekname.values();
        for(int i =0 ; i < wk.length; i++){
            switch(wk[i]){
                case MONDAY:
                     System.out.println("Monday is day of god shiva");
                     break;
                case TUESDAY:
                     System.out.println("Tuesday is the day of AP ");
                     break;
                case WEDNESDAY:
                    System.out.println("Wednesday is the day of god ganesha");
                    break;
                case THURSDAY:
                    System.out.println("Thursday is the day of god vishnu");
                    break;
                case FRIDAY:
                    System.out.println("Unkonwn");
                    break;
                case SATURDAY:
                 System.out.println("Saturday is the day of god sani ");
                 break;
                 case SUNDAY:
                 System.out.println("Sunday is the day of god of Surya");
                 break;
                 default:
                 System.out.println("This is the default day of god");







            }
        }
    }
}
