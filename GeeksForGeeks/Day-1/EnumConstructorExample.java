 
// Java program to demonstrate how values can
// be assigned to enums.
enum TrafficSignal
{
    // This will call enum constructor with one
    // String argument
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

    // declaring private variable for getting values
    private String value;

    // getter method
    public String getAction()
    {
        return this.value;
    }

    // enum constructor - cannot be public or protected
    private TrafficSignal(String action)
    {
        this.value = action;
    }
}

// Driver code
public class EnumConstructorExample
{
    public static void main(String args[])
    {
        // let's print name of each enum and there action
        // - Enum values() examples
        TrafficSignal[] signals = TrafficSignal.values();

        for (TrafficSignal signal : signals)
        {
            // use getter method to get the value
            System.out.println("name : " + signal.toString() +
                        " action: " + signal.getAction() );
        }
    }
}
    

