package basic;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {
	static class sampleObject implements Comparable<sampleObject>{
		private String username;
		private int id;
		public void setUsername(String username) {
			this.username = username;
		}
		public void setId(int id) {
			this.id = id;
		}
		sampleObject(){
			//do nothing;
		}
		sampleObject(String username, int id){
			this.setId(id);
			this.setUsername(username);
		}

		@Override
		public int compareTo(sampleObject so) {
			// TODO Auto-generated method stub
			if (this.id <  so.id)
				return 1;
			else if (this.id > so.id)
				return -1;
			else 
				return 0;
		}
		
		
	}
	
	public static void print(TreeMap tm) {
		/* Display content using Iterator*/
	      Set<Entry<String, Integer>> set = tm.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.println(mentry.getKey().getClass());
	         if (mentry.getKey() instanceof sampleObject) {
	        	 System.out.print("key is: "+ ((sampleObject)mentry.getKey()).id + "--" +
	        			 ((sampleObject)mentry.getKey()).username + " & Value is: ");
	         }else{
	        	 System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         }
	         System.out.println(mentry.getValue());
	      }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("ran", Integer.parseInt("123"));
		tm.put("Jing", Integer.parseInt("456"));
		tm.put("Jing", Integer.parseInt("4567"));
		
		TreeMapSample.print(tm);
		
		TreeMap<sampleObject, Integer> tm2 = new TreeMap<sampleObject, Integer>();
		tm2.put(new sampleObject("t1", 72), 789);
		tm2.put(new sampleObject("t2", 23), 157);
		TreeMapSample.print(tm2);

	}

}
