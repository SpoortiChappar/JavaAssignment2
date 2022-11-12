package in.ineuron.main;

public class Ass25 {

	void sort(int array[]) {
		int n = array.length;
		for(int i =0;i<n-1;i++) {
			int min_element=i;
			for(int j=i+1;j<n;j++) {
			if(array[j]<array[min_element]) {
				min_element=j;
				int temp=array[min_element];
				array[min_element]=array[i];
				array[i]=temp;
				}
			}
		}
		
	}
	void printArray(int array[]) {
		int n=array.length;
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}  
	public static void main(String[] args) {
		
		Ass25 ass=new Ass25();
		int array[]= {15,10,99,53,36};
		ass.sort(array);
		System.out.println("sorted elements");
		ass.printArray(array);
	}
}
