
class ShutdownHook{

    // Shutdown Hooks are a special construct that allows developers to plug in a piece of code to be executed when the JVM is shutting down.
    public static void main(String [] args){
        Runtime.getRuntime().addShutdownHook(new Thread(){
            public void run(){
                System.out.println("Shut down hook is running");
            }
        });
        System.out.println("Application is Terminating");
    }
    //output
// Application is Terminating
// Shut down hook is running

}