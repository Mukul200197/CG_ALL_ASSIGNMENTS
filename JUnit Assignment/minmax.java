
public class minmax {

public int[] minmaxFinder(int[] a) {
		int[] arr=new int[2];
		int min = a[0],max=0;
	     
	      for(int i=0; i<a.length; i++ ) {
	         if(a[i]<min) {
	            min = a[i];
	         }
	      }
	       arr[0]=min;
	       for(int i=0; i<a.length; i++ ) {
		         if(a[i]>max) {
		            max = a[i];
		         }
		      }
	       arr[1]=max;
	  return arr;
	       
	}

}
