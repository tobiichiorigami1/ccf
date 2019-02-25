import java.util.Scanner;

public class FenDuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		int a[]=new int[n];
		int count=1;
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			if(a[i+1]==a[i]) {
				continue;
			}
			else {
				count++;
			}
		}
		System.out.println(count);
	}

}
