
import java.util.Scanner;
public class Main2 {
public static void main(String[] args) {
new Main2().run();
}
public void run(){
Scanner sc=new Scanner(System.in);
int x1=0,x2=0,y1=0,y2=0;
int[][] flag=new int[107][107];
int n=sc.nextInt();
for(int k=0;k<n;k++){
x1=sc.nextInt();
y1=sc.nextInt();
x2=sc.nextInt();
y2=sc.nextInt();
for(int i=x1;i<x2;i++){
for(int j=y1;j<y2;j++){ //对每个单元格建立坐标
flag[i][j]=1; //已扫描过的单元格状态记为1，这道题的突破口
}
}
}
int result=0;
for(int i=0;i<=100;i++){
for(int j=0;j<=100;j++){
if(flag[i][j]==1){
result+=1;
//System.out.println(result); 测试
}
}
}
System.out.println(result);
}
}
