import java.util.*;
public class Discriminant{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a,b,c,d;
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
	  d=(b*b)-(4*a*c);
        System.out.println("Discriminant="+d);
    }
}
