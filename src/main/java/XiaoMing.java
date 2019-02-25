import java.util.Scanner;

public class XiaoMing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//首先记录各个灯的时间
		String ss=sc.nextLine();
		int red = Integer.parseInt(ss.split(" ")[0]);
		int yellow = Integer.parseInt(ss.split(" ")[1]);
		int Green = Integer.parseInt(ss.split(" ")[2]);
		//记录路段数
		int n = Integer.parseInt(sc.nextLine());
		//定义时间
		int time = 0;
		int i = 0;
		//当通过的路段数小于当前的总路段时，进行时间累加
		while(i<n) {
			String s=sc.nextLine();
			int a=Integer.parseInt(s.split(" ")[0]);
			int b=Integer.parseInt(s.split(" ")[1]);
			if(a==0) {
				time += b;
				i++;
			} 
			else if(a == 1) {
				time += b;
				i++;
			}
			else if(a == 2) {
				time += b + red;
				i++;
			}
			else if (a == 3) {
				time += 0;
				i++;
			}
		}
		System.out.println(time);
	}

}
