package arrays;

public class Matrix {
	public static void main(String[] args) {
		int k[][]=new int[2][2];
		k[0][0]=10;
		k[0][1]=20;
		k[1][0]=40;
		k[1][1]=50;
		for(int i=0;i<=1;i++)
		for(int j=0;j<=1;j++){
			System.out.println(k[i][j]+" ");
		}
		System.out.println("matrix array");
	}

}
