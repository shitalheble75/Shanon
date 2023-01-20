package zero_parameterised_constructor;

public class PUBG {//ULC
	public static void main(String[] args) {
		GUN g1=new GUN();//zero parameter constructor
		g1.gunName="AK47";
		g1.noOfBullets=6;
		g1.shoot();
		
		GUN g2=new GUN();
		g2.gunName="Pistol";
		g2.noOfBullets=10;
		g2.shoot();
	}

}
