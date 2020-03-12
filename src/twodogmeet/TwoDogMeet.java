/*
 * Amer Stas.
 * 12/03/2020
 *This prgram is about two dogs meeting
*/
package twodogmeet;
import static twodogmeet.Dog.friendlyMEtting;
public class TwoDogMeet {
    //Aggression >5 is bad
    // Hunger >5 is bad
    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        //creating two dogs object
        Dog dog1= new Dog();
        Dog dog2 = new Dog();
        //setting the aggression
        dog1.setAgression(4);
        System.out.println(dog1.getAgression());
        System.out.println(dog2.getAgression());
        //printing the result to screen
        System.out.println(dog1.toString());
        System.out.println("-----------------");
        System.out.println(dog2.toString());
        System.out.println("------------------");
        // performing the meeting between the two dogs
        dog1.friendlyMEtting();
        dog2.angryMEtting();
        
        
    }
    
    }   

