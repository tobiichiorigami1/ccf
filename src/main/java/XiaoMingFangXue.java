import java.util.Scanner;

public class XiaoMingFangXue {
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
				long time = 0;
				int i = 0;
				//当通过的路段数小于当前的总路段时，进行时间累加
				while(i<n) {
					String s=sc.nextLine();
					int a=Integer.parseInt(s.split(" ")[0]);
					int b=Integer.parseInt(s.split(" ")[1]);
					long c =0;
					//路口。直接加上过路时间
					if(a==0) {
						time+=b;
					}
					//到灯了，先看当前的时间对于路灯周期多了多少
					else  {
						c = time % (red+yellow+Green);
						//如果当前灯仍未变化
						if(b-c>0) {
							if(a!=3) {
								time += b-c;
								if(a == 2) {
									time += red;
								}
							}
							
						}
						else {
							if(a ==1) {
								
								if(c-b<=Green) {}
								else if(c-b>Green&&c-b<Green+yellow) {
									time += red + yellow-(c-b-Green); 
								}
								else if(c-b>=Green+yellow) {
									time += red -(c-b-Green -yellow); 
								}
							}
							else if (a==2) {
								if(c-b<red) {
									time += red - (c-b);
								}
								else if(c-b>=red&&c-b<=red+Green)
								{}
								else if(c-b>red+Green) {
									time += yellow-(c-b-(red + Green))+red;
								}
							}
							else if(a ==3) {
								if (c-b<yellow) {
									time += yellow - (c-b)+red;
								}
								else if(c-b>=yellow&&c-b<=yellow+red) {
									time += red-(c-b-yellow);
								}
								else if(c-b > yellow + red) {
									
								}
							}
							
						}
					}
					i++;
				}
				System.out.println(time);
			}
}
