import java.util.Scanner;

public class Juxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		int h[]=new int[n];
		for(int i=0;i<h.length;i++) {
			h[i]=scanner.nextInt();
		}
		int are=0;
		for(int i=0;i<h.length;i++) {
			int hegiht=h[i];
			for(int j=i;j<h.length;j++) {
				if(h[j]<hegiht) {
					hegiht=h[j];
				}
				int mj=hegiht*(j-i+1);
				if(are<mj) {
					are=mj;
				}
			}
		}
		System.out.println(are);
	}

}
