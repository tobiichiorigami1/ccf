import java.util.HashMap;
import java.util.Scanner;

import java.util.Map;

public class XiangFan {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=Integer.parseInt(scanner.nextLine());
	int []a=new int[n];
	int count=0;
	for(int i=0;i<n;i++) {
		a[i]=scanner.nextInt();
	}
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==(-1)*a[j]) {
				count++;
			}
		}
	}
	System.out.println(count);
}
}
