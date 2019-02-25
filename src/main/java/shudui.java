import java.util.Scanner;

public class shudui {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		int count=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]-1==a[j]||a[i]+1==a[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
