package studio3;
import java.util.Scanner;
public class Sieve {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What would you like n to be?");
		int n = scan.nextInt();

		boolean [] list = new boolean[n+1];
		for(int a = 0; a <= n; a++) {
			list[a] = true;
		}
		for(int i = 2; i <= n; i++) {
			if(list[i]==true) {
				for (int j = (int)Math.pow(i, 2); j< n+1; j+=i) {
					list[j]=false;
				}
			}
		}
		for(int k = 2; k <= n; k++) {
			if (list[k] == true) {
				System.out.println(k);
			}
		}

		
	}
}


