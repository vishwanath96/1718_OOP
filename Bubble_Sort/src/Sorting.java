
public class Sorting {
	private int []array=null;
	
	public void bsort() {		
		System.out.println("--------Bubble Sort---------\n");

		int i=0;
		int j=0;
		int temp=0;
		int n=array.length;
		
		System.out.println("Input :");
		for(i=0;i<n;i++) {
			System.out.print(array[i] + " ");
		}		
		
		for(i=0;i<n;i++) {
			for(j=1;j<n-i;j++) {
				if(array[j-1]>array[j]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
				
		System.out.println("\n\nOutput :");
		for(i=0;i<n;i++) {
			System.out.print(array[i] + " ");
		}	
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
}
