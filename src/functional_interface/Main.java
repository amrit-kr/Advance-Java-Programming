
package functional_interface;

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
        
       GreetingMessage gm1 = new GreetingMessage() {
			
			@Override
			public void greet(String name) {
				
				System.out.println("Welcome "+name);
			}
		};
		gm1.greet("Kumar");
		
    }

    
}
