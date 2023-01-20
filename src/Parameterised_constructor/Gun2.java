package Parameterised_constructor;

public class Gun2 {
		String gunName;
		int noOfBullets;
		//constructor
		public Gun2(String gunName,int noOfBullets) {
			this.gunName=gunName;
			this.noOfBullets=noOfBullets;
		}


		//nonstatic method
		public void shoot() {
			for(int i=1;i<=noOfBullets;i++) {
				System.out.println("Deshkew");
			}
			
		}
		}



