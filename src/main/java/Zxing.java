import java.util.Scanner;

public class Zxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		int a[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scanner.nextInt();
			}
		}
		int count=0;		
		for(int i=0;i<n;i++) {
			int sum=0;
			if(count%2==0) {
				
			for(int j=i;j>=0;j--) {
				System.out.print(a[j][sum]+" ");
				sum++;
			}
			
			}
			else if(count%2==1) {
					for(int j=i;j>=0;j--) {
						System.out.print(a[sum][j]+" ");
						sum++;
					}
					
			}
		count++;
		}
		count++;
		for(int i=1;i<n;i++) {
			int sum=n-1;
			if(count%2==0) {
			for(int j=i;j<=n-1;j++) {

				System.out.print(a[j][sum]+" ");
				sum--;
			}
			}
			else if(count%2==1) {
				 sum=n-1;
					for(int j=i;j<=n-1;j++) {

						System.out.print(a[sum][j]+" ");
						sum--;
					}
				
			}
		count++;
		}
		}
			
		}
