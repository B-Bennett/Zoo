/**
 * Created by BennettIronYard on 10/26/15.
 */
public class AnnonymousFunctionExample {
    public static void main(String[] args) {
        //run code from separte method
        sayHello();

        //run code from anonymouns class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from an anonymous class!");
            }
        };
        r1.run(); // useful when you want to run code in the future

        // Run code form anonymous function
        Runnable r2 = () -> {
            System.out.println("Hello from an anonymous function");
        };
        r2.run();// in order to initiate function. print out
    }

    static void sayHello() {
        System.out.println("Hello from a separate method!");
    }
}
