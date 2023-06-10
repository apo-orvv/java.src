import java.io.*;
public class DataInputStreamEx {
    public static void main(String args[]) throws IOException{
    InputStream is=new FileInputStream("C:\\Users\\apoor\\Desktop\\21BCE1169\\testout.txt");
    DataInputStream dis=new DataInputStream(is);
    int itemNo; String itemName,ch; double unitPrice;
    while(dis.available()>0){
        System.out.println("Enter the Item Number, Item Name & Unit Price:");
        itemNo=dis.readInt();
        itemName=dis.readUTF();
        unitPrice=dis.readDouble();
        System.out.println(itemNo+"\t"+itemName+"\t"+unitPrice);
    }
    dis.close();
    }
}
