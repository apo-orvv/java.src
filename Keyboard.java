import java.io.*;
public class Keyboard {
    public static void main(String args[]){
        try{
            System.out.println("Please press any key: ");
            char key=(char)System.in.read();
            System.out.println("The key pressed was: "+key);
        }
        catch(IOException ioe){
            System.out.println("Excception here!");
        }
    }    
}
