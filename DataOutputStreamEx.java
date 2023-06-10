import java.io.*;
import java.util.*;
public class DataOutputStreamEx {
    public static void main(String args[]) throws IOException{
    OutputStream os=new FileOutputStream("C:\\Users\\apoor\\Desktop\\21BCE1169\\testout.txt");
    DataOutputStream dos=new DataOutputStream(os);
    int itemNo; String itemName,ch; double unitPrice;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("Enter the Item Number, Item Name & Unit Price:");
        itemNo=sc.nextInt();
        itemName=sc.next();
        unitPrice=sc.nextDouble();
        dos.writeInt(itemNo);
        dos.writeUTF(itemName);
        dos.writeDouble(unitPrice);
        System.out.println("Continue? (Yes/No)");
        ch=sc.next();
    }while(ch.equals("Yes"));
    dos.close();
    }
}
