import java.util.Scanner;

public class ShuHe {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	while(n>=1) {
		sum+=n%10;
		n=n/10;
	}
	System.out.println(sum);
}
}
