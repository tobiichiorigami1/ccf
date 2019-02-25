import java.util.Scanner;

public class FAnzhaun {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int r=scanner.nextInt();
	int c=scanner.nextInt();
	int a[][]=new int[r][c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			a[i][j]=scanner.nextInt();
		}
	}
	for(int i=c-1;i>=0;i--) {
		for(int j=0;j<r;j++) {
			if(j==r-1) {
				System.out.print(a[j][i]);
			}
			else {
			System.out.print(a[j][i]+" ");
			}
			}
		System.out.println();
	}

	}
}
