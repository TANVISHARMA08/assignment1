import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Length of line is:"+dis);
		int x1,x2,y1,y2,x3,x4,y3,y4;
		double dis1,dis2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point value for line 1:");
		x1=sc.nextInt();
		System.out.println("Enter y1 point value for line 1:");
		y1=sc.nextInt();
		System.out.println("Enter x2 point value for line 1:");
		x2=sc.nextInt();
		System.out.println("Enter y2 point value for line 1:");
		y2=sc.nextInt();
		System.out.println("Enter x3 point value for line 2:");
		x3=sc.nextInt();
		System.out.println("Enter y3 point value for line 2:");
		y3=sc.nextInt();
		System.out.println("Enter x4 point value for line 2:");
		x4=sc.nextInt();
		System.out.println("Enter y4 point value for line 2:");
		y4=sc.nextInt();
		dis1=distance(x1,x2,y1,y2);
		dis2=distance(x3,x4,y3,y4);
		System.out.println("Length of line 1 is:"+dis1);
		System.out.println("Length of line 2 is:"+dis2);
		if(dis1>dis2) {
			System.out.println("Length of line1 is graeter:");
		}
		else if(dis1<dis2) {
			System.out.println("Length of line2 is greater:");
		}
		else {
			System.out.println("both are equal:");
		}


	}
	
	public static double distance(int x1,int x2,int y1,int y2) {
		double dis;
		dis= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return dis;
	}

}
