import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;




public class Dashu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		String a=scan.nextLine();
		int [] k=new int[n];
		for(int i=0;i<n;i++) {
			k[i]=Integer.parseInt(a.split(" ")[i]);
		}
		for(int i=0;i<k.length;i++) {
			if(map.get(k[i])==null) {
				map.put(k[i],1);
							}
			else {
				map.put(k[i],map.get(k[i])+1);
			}
		}
		int max=0;
		List<Integer> ls=new ArrayList<Integer>();
		for(int o:map.keySet()) {
			if(map.get(o)>max) {
				max=map.get(o);
			}
		}
		for(int o:map.keySet()) {
			if(map.get(o)==max) {
				ls.add(o);
			}
		}
		if(ls.size()==1) {
			System.out.println(ls.get(0));
		}
		else {
			int w=100000;
			for(int l:ls) {
				if(w>l) {
					w=l;
				}
			}
			System.out.println(w);
		}
		
	}

}
