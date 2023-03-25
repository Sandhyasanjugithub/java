import java.util.Iterator;

public class New {

	public static void main(String[] args) {
	
			int prime[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
			for(int i=0; i<prime.length;i++) {
				int count=0;
						for(int j=1; j<15;j++) {
							if(prime[i]%j==0) {
								count++;
							}
							}
						if(count==2) {
							System.out.println(prime[i]);
						}
		}
			

	}

}
