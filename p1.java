//  Mark Villa
//  4/20/18
//  Pyramid of Numbers

import java.lang.Math;

public class P1 {
  
  public static void main(Strings arg[]) {
    System.out.println(pyramid(5));
  }
  
    public static void pyramidNumbers(int levels) {
    	int rowcount = 1, numbers = 1;
      String row = "";
        for (int i = 0; i < levels; i++) {
        	for (int j = 0; j < rowcount; j++) {
        		row += numbers + " ";
        		numbers++;
        	}
        	System.out.println(row);
        	row = "";
        	rowcount++;
        }
    }
    
}
