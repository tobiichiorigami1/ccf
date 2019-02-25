import java.util.Scanner;

import org.apache.derby.iapi.services.io.FormatableIntHolder;
import org.apache.hadoop.hive.ql.parse.HiveParser.ifExists_return;

import com.facebook.fb303.FacebookService.Iface;

public class Date {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int year =scanner.nextInt();
		int days=scanner.nextInt();
		int months=1;
		int ri=0;
		for(int i=days;i>=0;) {
		 {
				int monthday=0;
				if(months==1||months==3||months==5||months==7||months==8||months==10||months==12) {
					monthday=31;
				}
				else if(months==2) {
					if((year%4==0&&year%100!=0)||year%400==0) {
					monthday=29;
					}
					else {
						monthday=28;	
					}
				}
				else {
					monthday=30;
				}
				if(i-monthday>0) {
					i-=monthday;
					months++;
				}
				else {
					ri=i;
					break;
				}
				
		}
		}
		System.out.println(months);
		System.out.println(ri);
	}
		
}
