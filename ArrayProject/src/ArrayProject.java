import java.util.Scanner;

public class ArrayProject {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many Days?");
		int  days = s.nextInt();
		double sum = 0;
		double[] temp = new double[days];
		for(int i= 0; i<days;i++) {
			System.out.println("Enter temp for day "+i);
			double d = s.nextDouble();
			sum +=d;
			temp[i]=d;
		}
		
		
		
		 double avg = sum/days;
		 System.out.println("Average Temp: "+ avg);
		 
		 int count = 0;
		 for (int i = 0; i < temp.length; i++) {
			if(temp[i]>avg) {
				count++;
			}
		}
		 System.out.println("Number of Days for which temp is above avg temp:" + count);
	}
}
