import java.util.Scanner;

public class BuyCai {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		int b[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(i==0) {
				b[i]=(int)((a[i]+a[i+1])/2);
				continue;
			}
			if(i==a.length-1) {
				b[i]=(int) ((a[i]+a[i-1])/2);
				continue;
			}
			else {
				b[i]=(int)((a[i]+a[i-1]+a[i+1])/3);
				continue;
			}
		}
		for(int c:b) {
			System.out.print((int)c+" ");
		}
	}

}
