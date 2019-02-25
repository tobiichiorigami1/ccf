import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String  aString=scanner.nextLine();
		String a[]=aString.split(" ");
		int count=0;
		int score=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].equals("1")) {
				score+=1;
				count=0;
			}
			if(a[i].equals("2")) {
				score=score+2+2*count;
				count=count+1;
			}
			if(a[i].equals("0")) {
				break;
			}
		}
		System.out.println(score);
	}

}
