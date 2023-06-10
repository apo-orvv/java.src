import java.util.*;
class Total_workers
{
int total;
void inp()
{
Scanner s=new Scanner(System.in);
total=s.nextInt();
}
void disp()
{
System.out.println("Workers:"+total);
}
}
class Partime_workers extends Total_workers
{
String n1;
String desig1;
int hr1;
int sal1;
double tot1;
void p_inp()
{
inp();
Scanner s=new Scanner(System.in);
n1=s.next();
desig1=s.next();
hr1=s.nextInt();
sal1=s.nextInt();
}
void p_comp(int hr1)
{
if(hr1<30)
tot1=sal1*hr1;
else
tot1=sal1*30+1.5*sal1*(hr1-30);
}
void p_disp()
{
disp();
System.out.println("Part-Time");
System.out.println("Name:"+n1);
System.out.println("Designation:"+desig1);
System.out.println("Hours:"+hr1);
System.out.println("Total Salary:"+tot1);
}
}
class Fulltime_workers extends Total_workers
{
String n2;
String desig2;
int hr2;
int sal2;
double tot2;
void f_inp()
{
inp();
Scanner s=new Scanner(System.in);
n2=s.next();
desig2=s.next();
hr2=s.nextInt();
sal2=s.nextInt();
}
void f_comp(int hr2)
{
tot2=sal2*50;
}
void f_disp()
{
disp();
System.out.println("Full-Time");
System.out.println("Name:"+n2);
System.out.println("Designation:"+desig2);
System.out.println("Hours:"+hr2);
System.out.println("Total Salary:"+tot2);
}
}
class Workers_Pay
{
public static void main(String[] args)
{
Partime_workers p=new Partime_workers();
p.p_inp();
p.p_comp(p.hr1);
Fulltime_workers f=new Fulltime_workers();
f.f_inp();
f.f_comp(f.hr2);
p.p_disp();
f.f_disp();
}
}