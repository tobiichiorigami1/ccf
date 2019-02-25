import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zc {
	public static int getTime(List<Integer> l,List<Integer> p) {
		int s=0;
		int d=0;
		int count=0;
		for(int a:l) {
			for(int b:p) {
				if(a==b&&count==0) {
					s=a;
					count+=1;
					break;
				}
				else if(a==b) {
					d=a;
					count++;
					break;
				}
			}
		}
		if(count>1) {
			return s<d?d-s:s-d;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<List<Integer>> H=new ArrayList<List<Integer>>();
		List<List<Integer>> W=new ArrayList<List<Integer>>();
		int time=0;
		for(int i=0;i<n;i++) {
			int s=sc.nextInt();
			int d=sc.nextInt();
			List<Integer> szd=new ArrayList<Integer>();
			for(int j=s;j<=d;j++) {			
				szd.add(j);
			}
			H.add(szd);
		}
		for(int i=0;i<n;i++) {
			int s=sc.nextInt();
			int d=sc.nextInt();
			List<Integer> szd=new ArrayList<Integer>();
			for(int j=s;j<=d;j++) {			
				szd.add(j);
			}
			W.add(szd);
		}
		for(List<Integer> k:W) {
			for(List<Integer> p:H) {
				time+=getTime(k,p);
			}
		}
		System.out.println(time);
	}
}
