import java.util.Scanner;




public class ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		String m=a.substring(0,a.length()-1);
		String b=a.replaceAll("-","");
		String []k=b.split("");
		int l[]=new int [9];
		String bString=null;
		for(int i=0;i<k.length;i++) {
			if(i==k.length-1) {
				bString=k[i];
				
			}
			else{
				l[i]=Integer.parseInt(k[i]);
			}
		}
		int sum=0;
		for(int i=0;i<l.length;i++) {
			sum+=l[i]*(i+1);
		}
		int re=sum%11;
		if(!bString.equals("X")&&re==Integer.parseInt(bString)&&re!=10) {
			System.out.println("Right");
		}
		else if(re==10&&bString.equals("X")){
			System.out.println("Right");
		}
		else if(re==10&&!bString.equals("X")){
			System.out.println(m+"X");
		}
		else {
			
			System.out.println(m+re);
		}
		
	}
	
}
