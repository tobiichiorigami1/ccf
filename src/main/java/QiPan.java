import java.util.Scanner;

public class QiPan {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	int qi[][]=new int[row][col];
	int qi1[][]=new int[row][col];
	int index=0;
	int hang=0;
	boolean flag=false;
	for(int i=0;i<qi.length;i++) {
		for(int j=0;j<qi[i].length;j++) {
			qi[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<qi.length;i++) {
		for(int j=0;j<qi[i].length;j++) {
			qi1[i][j]=1;
		}
	}
	for(int i=0;i<qi.length;i++) {
		int  count=1;
		for(int j=0;j<qi[i].length-1;j++) {
			if(qi[i][j]==qi[i][j+1]&&flag==false) {
				index=j;
				flag=true;
				count++;
			}
			else if(qi[i][j]==qi[i][j+1]&&flag==true) {
				count++;
			}
			else {
				if(count>=3) {
					for(int k=0;k<count;k++) {
						qi1[i][index+k]=0;						
					}
					count=1;
					flag=false;
				}
				else {
					count=1;
					flag=false;
				}
				
			}
			if(j==qi[i].length-2) {
				if(count>=3) {
					for(int k=0;k<count;k++) {
						qi1[i][index+k]=0;						
					}
				}
				else {

				}
			}
		
		}
	}
	for(int i=0;i<col;i++) {
		int  count=1;
		for(int j=0;j<row-1;j++) {
			if(qi[j][i]==qi[j+1][i]&&flag==false) {
				index=j;
				System.out.println("第"+index+"行"+"第"+i+"列");
				flag=true;
				count++;
			}
			else if(qi[j][i]==qi[j+1][i]&&flag==true) {
				count++;
			}
			else {
				System.out.println("第"+index+"行"+"第"+i+"列");
				if(count>=3) {
//					for(int k=0;k<count;k++) {
//						qi1[index+k][i]=0;							
//					}
					qi1[index][i]=0;
					
					count=1;	
					flag=false;
				}
				else {
					count=1;
					flag=false;
				}
			}
			if(j==row-2) {
				if(count>=3) {
					for(int k=0;k<count;k++) {
						qi1[i][index+k]=0;						
					}
				}
				else {

				}
			}
		}
	}
	for(int i=0;i<qi.length;i++) {
		for(int j=0;j<qi[i].length;j++) {
			if(qi1[i][j]==0) {
				qi[i][j]=0;
			}
		}
		
	}
	for(int i=0;i<qi.length;i++) {
		for(int j=0;j<qi[i].length;j++) {
			System.out.print(qi[i][j]+" ");
		}
		System.out.println();
	}
}
}
