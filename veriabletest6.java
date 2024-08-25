class veriabletest6 {


int no = 1200;
string name = "Pradip";
String add ="pune";

public void m1(){
System.out.println("---m1 method---");
int no = 1300;
string name = "sakunde";
String add ="beed";
System.out.println(no);
System.out.println(name);
System.out.println(add);

}


public void m2(){
System.out.println("---m2 method---");
veriabletest6 v1 = new veriabletest6();
System.out.println(v1.no);
System.out.println(v1.name);
System.out.println(v1.add);


}
public static void main (String[] args)
System.out.println("---main method---");
veriabletest6 v2 = new veriabletest6();
System.out.println(v2.no);
System.out.println(v2.name);
System.out.println(v2.add);
v2.m1():
v2.m2();

}