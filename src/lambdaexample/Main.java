
package lambdaexample;


/**
 * @author Amrit1.Kumar
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Amrit");    
        
        GreetingMessage gm1 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm1.greet("Amrit");
        
        MessagePrinter mp = () -> {
            System.out.println("This is a new message");
        };
        mp.printMessage();
        
       
    }
    
}