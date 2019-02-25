import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class chuankou {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String a[]=scanner.nextLine().split(" ");
		int n=Integer.parseInt(a[0]);
		int m=Integer.parseInt(a[1]);
		Map<Window,Integer> mp=new HashMap<Window,Integer>();
		for(int i=0;i<n;i++) {
			String kk[]=scanner.nextLine().split(" ");
			Window ad=new Window(Integer.parseInt(kk[0]),Integer.parseInt(kk[1]),Integer.parseInt(kk[2]),Integer.parseInt(kk[3]),i+1);
			mp.put(ad,n-i);
		}
		for(int i=0;i<m;i++) {
			String ks[]=scanner.nextLine().split(" ");
			int q=Integer.parseInt(ks[0]);
			int b=Integer.parseInt(ks[1]);
			Map<Window,Integer> p=new HashMap<Window,Integer>();
			for(Window d:mp.keySet()) {
				if(d.x1<=q&&d.x2>=q&&d.y1<=b&&d.y2>=b) {
					p.put(d, mp.get(d));
				}
			}
			if(!p.isEmpty()) {
			int min=n+1;
			Window wi=new Window();
			for(Window d:p.keySet()) {
				if(min>mp.get(d)) {
					min=mp.get(d);
					wi=d;
				}
			}
			
			for(Window d:mp.keySet()) {
				if(mp.get(d)<min) {
					mp.put(d,mp.get(d)+1);
				}
			}
			mp.put(wi,0);
			System.out.println(wi.hao);
			
		}
			else {
				System.out.println("IGNORED");
			}
		}
	}
	static class Window{
		int x1;
		int y1;
		int x2;
		int y2;
		int hao;
		public Window() {
			
		}
		public Window(int x1, int y1, int x2, int y2,int hao) {
			super();
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.hao =hao;
		}		
	}
}
