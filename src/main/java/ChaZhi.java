import java.util.Scanner;

public class ChaZhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		int a[]=new int[n];
		int min=10000;
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
					}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int c=a[i]-a[j];
				if(c<0) {
					c=-c;
				}
				if(min>c) {
					min=c;
				}
			}
		}
		System.out.println(min);
	}

}
