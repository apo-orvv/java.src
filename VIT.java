import java.util.*;
class UG
{
String name;
String degree;
String branch;
double gpa;
int sem;
String sec_sch;
int marks;
void input()
{
Scanner s=new Scanner(System.in);
name=s.next();
degree=s.next();
branch=s.next();
gpa=s.nextDouble();
sem=s.nextInt();
sec_sch=s.next();
marks=s.nextInt();
}
void disp()
{
System.out.println("Name: "+name);
System.out.println("Degree: "+degree);
System.out.println("Branch: "+branch);
System.out.println("GPA: "+gpa);
System.out.println("Semester: "+sem);
System.out.println("Secondary School: "+sec_sch);
System.out.println("Marks(percentage): "+marks);
}
}
class Master extends UG
{
String clg;
double cgpa;
void Mas_inp()
{
input();
Scanner s=new Scanner(System.in);
clg=s.next();
cgpa=s.nextDouble();
}
void Mas_disp()
{
disp();
System.out.println("Degree: "+degree);
System.out.println("College: "+clg);
System.out.println("CGPA: "+cgpa);
}
}
class PHD extends Master
{
String mas_deg;
String area;
String superv;
void ph_inp()
{
Mas_inp();
Scanner s=new Scanner(System.in);
mas_deg=s.nextLine();
area=s.nextLine();
superv=s.next();
}
void ph_disp()
{
Mas_disp();
System.out.println("Masters Degree: "+mas_deg);
System.out.println("College: "+clg);
System.out.println("CGPA: "+cgpa);
System.out.println("Area of Specialization: "+area);
System.out.println("Supervisor: "+superv);
}
}
class VIT
{
public static void main(String[] args)
{
PHD o=new PHD();
o.ph_inp();
o.ph_disp();
}
}