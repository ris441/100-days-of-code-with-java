class ChildThread extends Thread{
    public void run(){
        System.out.println("In clean up Code");
        System.out.println("In Shutdown Hook");
    }
}



class DemoHook {

    public static void main(String[] args) {
        Runtime current = Runtime.getRuntime();
        current.addShutdownHook(new ChildThread());

        for (int i = 1; i <= 10; i++) {
            System.out.println(20+" x "+i+" = "+20*i);
        }
    }
}
