package in.ineuron.main;

public class Ass22 {
	int partition(int a[],int start,int end) {
		int pivot=a[end];
		int i=start-1;
		
		for(int j=start;j<=end-1;j++) {
			if(a[j]<pivot) {
				i++;
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		int t=a[i+1];
		a[i+1]=a[end];
		a[end]=t;
		return (i+1);
	}
	void quick(int a[],int start,int end) {
		if(start<end) {
			int p=partition(a,start,end);
			quick(a,start,p-1);
			quick(a,p+1,end);
		}
		
	}
	void printArray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
	}	
	public static void main(String[] args) {
		Ass22 ass=new Ass22();
		int a[]= {1,18,27,2,19,25};
		int n=a.length;
		System.out.println("Array before sorting");
		ass.printArray(a,n);
		ass.quick(a,0,n-1);
		System.out.println("Array after sorting");
		ass.printArray(a, n);
		ass.quick(a,0,n-1);
		
	}
}
