import java.io.*;
public class KeyboardInput {
    public static void main(String args[]){
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader kbd=new BufferedReader(isr);
        try{
            System.out.print("Enter some characters and press return when finished: ");
            String s=kbd.readLine();
            System.out.println("The String was: "+s);
            kbd.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}