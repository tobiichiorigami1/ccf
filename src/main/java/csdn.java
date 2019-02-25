import java.util.Scanner;
 
public class csdn {
 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int M=s.nextInt();
		int N=s.nextInt();
		int [][] arr=new int[M][N];
		byte[][] flag=new byte[M][N];
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				if (j+1<N&&j+2<N) {
					if((arr[i][j]==arr[i][j+1])&&(arr[i][j]==arr[i][j+2])){
						flag[i][j]=1;
						flag[i][j+1]=1;
						flag[i][j+2]=1;
					}
				}
				if (i+1<M&&i+2<M) {
					if((arr[i][j]==arr[i+1][j])&&(arr[i][j]==arr[i+2][j])){
						flag[i][j]=1;
						flag[i+1][j]=1;
						flag[i+2][j]=1;
					}
				}
			}
		}
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				if(flag[i][j]==1){
					arr[i][j]=0;
				}
				System.out.print(arr[i][j]+" ");
			}	
			System.out.println();
		}
		
	}
 
}