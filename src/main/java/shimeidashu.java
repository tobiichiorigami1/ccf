import java.util.Scanner;

public class shimeidashu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kind=0;
		int[] arr = new int[10001];
			for(int i=0; i<n; i++) {
				kind = sc.nextInt();
				arr[kind] ++ ;	
		}
		int max = 0,j = 0;
		for(int i=0; i<10001; i++) {
						           
			if(max < arr[i]) {
				max = arr[i];
				j = i;
			}else if(max==arr[i]) {
				if(i<j) {
					j=i;
				}
			}
		}
		System.out.println(j);

	}

}
