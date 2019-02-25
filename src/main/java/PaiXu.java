import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.apache.calcite.util.Static;
import org.apache.hadoop.classification.InterfaceAudience.Public;

public class PaiXu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int a[]=new int[n];
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		Comparator<Map.Entry<Integer, Integer>> valueComparator = new Comparator<Map.Entry<Integer,Integer>>() {
	        public int compare(Entry<Integer, Integer> o1,
	                Entry<Integer, Integer> o2) {
	            // TODO Auto-generated method stub
	        	if(o1.getValue()==o2.getValue()) {
	        		return o1.getKey()-o2.getKey();
	        	}
	        	else {
	            return o2.getValue()-o1.getValue();
	        	}
	        	}			
	    };
		 List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		 Collections.sort(list,valueComparator);
		 for (Map.Entry<Integer, Integer> entry : list) {
		        System.out.println(entry.getKey() + " " + entry.getValue());
		    }
	}
	 
}
