import java.util.Scanner;

public class MenJin {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int [n];
	int b[]=new int [n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<i;j++) {
			if(a[j]==a[i]) {
				b[i]++;
			}
		}
	}
	for(int i=0;i<b.length;i++) {
		if(i==b.length-1) {
			System.out.print(b[i]+1);	
		}
		else {
		System.out.print(b[i]+1+" ");
		}
		}
		
}
}
