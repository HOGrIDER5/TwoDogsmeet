/*
 *Amer Stas
 * 12/03/2020
 * This prgram is about two dogs meeting
 */

package twodogmeet;
import javax.swing.*;
/**
 *
 * @author amsta5248
 */
public class Dog {
    private String  firstName,breedfirst;
    private int age, aggression,hunger;
    //Aggression >5 is bad
    // Hunger >5 is bad
    /**
     * @param args the command line arguments
     */
    public Dog(){
        //asking the input their inputs
       String name1 = JOptionPane.showInputDialog("Please Enter the name of your  dog");
       String breed1= JOptionPane.showInputDialog("Please Enter the breed of your dog");

       
       firstName = name1;
       breedfirst= breed1;

       int old = (int)(Math.random()*10+1);
       age = old;
       int agg = (int)(Math.random()*10+1);
       aggression=agg;
       int hun = (int)(Math.random()*10+1);
       hunger=hun;    }
    // using setter and getter method for integer properties
    public int getAge(){
        return age;
    
}
    public void setAge(int agee){
        agee=age;
    }
    public int getAgression(){
        return aggression;

    }
    public void setAgression(int agrre){
        aggression = agrre;
    }
    public int gethunger(){
        return hunger;
    }
    public void setHunger(int hunn){
        hunn=hunger;
    }
    //Method for friendly meeting
    public static void friendlyMEtting(){
        System.out.println("Arf,Arf");
    }
    // Method for angrey meeting
    public static void angryMEtting(){
        System.out.println("ARRRRFFFFF");
    }
    // printing the result the scr4een
    public String toString(){
        String output= "Name:" + firstName +"\n";
        output+= "Breed:" +breedfirst+"\n";
        output += "Aggression:"+ aggression+"\n";
        output+= "Hunger:" + hunger+"\n";
        output+= "Age:" + age+"\n";
        return output;
     }
    
    }
