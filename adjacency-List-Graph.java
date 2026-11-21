// adjacency list - undirectional graph
/*
input-
4 5
0 3
0 2
2 1
1 3
3 2
output-
0 -> [3, 2]
1 -> [2, 3]
2 -> [0, 1, 3]
3 -> [0, 1, 2]
  */
----------------------------------------------------------------------------
import java.util.*;

class Main
{
    static Scanner sc = new Scanner(System.in);
    
    static HashMap <Integer, ArrayList<Integer>> input(int n, int e){
        
        HashMap <Integer, ArrayList<Integer>> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            map.put(i, new ArrayList<Integer>());
        }
        
        for(int i=0; i<e; i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            
            map.get(u).add(v);
            map.get(v).add(u);
        }
        
        return map;
    }
    
    
    
	public static void main (String[] args)
	{
	    int n=sc.nextInt(); //vertex
	    int e=sc.nextInt(); //edges
	    
	    HashMap <Integer, ArrayList<Integer>> map = input(n,e);
	    
	    for(int i=0; i<n; i++){
	        System.out.println(i + " -> " + map.get(i));
	    }
	    
	    
	}
}

