import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class xiaoqiu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		String b=scanner.nextLine();
		String c[]=a.split(" ");
		String d[]=b.split(" ");
		int n=Integer.parseInt(c[0]);
		int L=Integer.parseInt(c[1]);
		int t=Integer.parseInt(c[2]);
		int []x=new int[n];
		int []v=new int [n];
		for(int i=0;i<d.length;i++) {
			x[i]=Integer.parseInt(d[i]);
			v[i]=1;
		}
		for(int i=0;i<t;i++) {	
			for(int j=0;j<x.length;j++) {
				 if(v[j] == 1) {
	                    x[j]+=1;
	                    if(x[j] == L)
	                        v[j] *= -1; 
	                } else {
	                    x[j]-=1;
	                    if(x[j] == 0)
	                       v[j] *= -1;
	                }

				
			}
			for(int k=0;k<x.length-1;k++) {
				for(int m=k+1;m<x.length;m++) {
					if(x[k]==x[m]) {
						v[k]=(-1)*v[k];
						v[m]=(-1)*v[m];
						break;
					}
				}
			}
			
			
		}
		for(int i=0;i<x.length;i++) {
			if(i!=x.length-1){
				System.out.print(x[i]+" ");
			}
			else {
			System.out.print(x[i]);
		}
		}		
	}

}
