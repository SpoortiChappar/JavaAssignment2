package in.ineuron.main;

public class Ass26 {

	  
		boolean isSubset(int a[],int b[]) {
		
		int i=0;
		int j=0;
		for(i=0;i<a.length;i++) {
			for(j=0;j<b.length;j++) {
			if(a[i]==b[j])
				break;	
		}
		if(j==b.length) 
			return false;
		}
			
			return true;
		}
			
		
		public static void main(String[] args) {
			
			int a[]= {10,20,30};
			int b[]= {10,20,30,40,50};
			Ass26 s=new Ass26();
			
			if(s.isSubset(a,b)) 
				System.out.println("a is subset of b");
			else 
				System.out.println("a is not subset of b");
			}
		
}
	
