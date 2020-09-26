package week3.day1;
//Classroom 2:
//Create class Calculator with below methods
//- 2 methods for add, 1 method with 2 int args , 1 method with 3 int args
//- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
//- 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
//- 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int
//create object for the Calculator class and execute all the methods
//
//ClassRoom3: 
//Create the same method(takeVideo) in Android Phone and Smart Phone and execute takeVideo method using ChildClass object

//Create the same method(takeVideo) in Android Phone and Smart Phone and execute takeVideo method using ChildClass object
public class Calculator {
public void add(int a,int b) {
System.out.println(a+b);
}
public void add(int a,int b, int c) {
System.out.println(a+b+c);
}
public void multiply(int a,int b) {
System.out.println(a*b);
}
public void multiply(int a,double b) {
System.out.println(a*b);
}
public void subtract(int a,int b) {
System.out.println(a-b);
}
public void subtract(double a,double b) {
System.out.println(a-b);
}	
public void divide(int a,int b) {
System.out.println(a/b);
	
}
public void divide(double a,int b) {
System.out.println(a/b);
}

public static void main(String[] args) {
	Calculator cal=new Calculator();
	cal.add(10, 20);
	cal.add(10, 20, 30);
	cal.subtract(20, 10);
	cal.subtract(30.0, 20.0);
	cal.multiply(10, 20);
	cal.multiply(10, 5.0);
	cal.divide(10, 5);
	cal.divide(50.0, 5);
}
}
