import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no upto prime no");
		int input=sc.nextInt();
		String output=prime(input);
		System.out.println(output);
	}
	public static String prime(int a) {
		String tem="";
		
		for(int i=2;i<=a;i++) {
			boolean check=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					check=false;
				}
				
			}
			if(check)
			tem=tem+i+",";
		}
		tem=tem.substring(0,tem.length()-1);
		
		
		return tem;
		
	}
}
