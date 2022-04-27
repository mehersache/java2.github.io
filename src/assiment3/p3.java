package assiment3;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				System.out.println("enter a number");
				int n=scan.nextInt();
				if(n%2==0) {
				for(int i=1;i<=n;i++) {
					if(i==1) {
						System.out.println("1");
						i++;
					}
				 if(i%2!=0) {
						for(int j=1;j<=i;j+=2) {
							System.out.print(j);
						}
							System.out.println();
					}
				}
					}
				else if(n%2!=0) {
					for(int i=n;i<=n+1;i++) {
						if(i%2!=0) {
							for(int j=1;j<=i;j+=2) {
								System.out.print(j);
							}
							System.out.println();
						}
					}
						}
					}
}
