import java.util.Scanner;

public class Fibonaccis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no up to we want fibonaccis");
		int a=sc.nextInt();
		String s=fibonaccis(a);
		System.out.println("fibonaccis up to "+a+":"+s);
		
	}
public static  String fibonaccis(int a) {
	int first=0,second=1,third=0;
	String tem="";
	tem=tem+first+","+second+",";
	for(int i=2;i<a;i++) {
		third=first+second;
		first=second;
		second=third;
		if(third<=a) {
		tem=tem+third+",";
		
		}
		else {
			break;
		}
	}
	tem=tem.substring(0,tem.length()-1);
	return tem;
	
}
}
