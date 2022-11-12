package in.ineuron.main;


public class Ass21 {
	public static void main(String[] args) {
		int a[]= {3,8,4,6,2,22,22,7,4};
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) 
				System.out.println(a[j]);
			}
		
		}
	}

}
