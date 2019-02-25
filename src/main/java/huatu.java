import java.util.Scanner;

public class huatu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int [][]a=new int[100][100];
		int u=0;
		for(int k=0;k<n;k++){
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			for(int i=x1;i<x2;i++) {
				for(int j=y1;j<y2;j++) {
					a[i][j]=1;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum+=a[i][j];
			}
		}
		System.out.println(sum);
	}


}
