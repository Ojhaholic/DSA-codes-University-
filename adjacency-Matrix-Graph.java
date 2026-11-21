// adjacency matrix - undirectional graph

// core idea - this matrix is used to represent a graph in a 2d format. Each cell having a relationship will have value 1, else others will have 0.

/*
input 
4 5
0 3
0 2
2 1
1 3
3 2

output
0011
0011
1101
1110
*/
--------------------------------------------------------------------------------------
import java.util.*;
class Main
{
    static Scanner sc = new Scanner(System.in);
    
    static int[][] input(int n, int e){
        
        int[][] arr = new int[n][n];
        
        for(int i=0; i<e; i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
        
            arr[u][v]=1;
            arr[v][u]=1;
        }
        
        return arr;
    }    
	public static void main (String[] args)
	{
	    int n=sc.nextInt(); //vertex
	    int e=sc.nextInt(); //edges
	    
	    int[][] arr = input(n,e);
	    
	    for(int i=0; i<n; i++){
	        for(int j=0; j<n; j++){
	            System.out.print(arr[i][j]);
	        }
	        System.out.println();
	    }
	    
	}
}

