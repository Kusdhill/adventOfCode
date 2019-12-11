import java.util.Scanner;
import java.io.File;

public class day1{

	public static int rocketEquation(int[] input){
		int n = input.length;
		int fuelRequired = 0;
		int curFuel = 0;

		for(int i=0; i<n; i++){
			fuelRequired += (input[i]/3)-2;
		}

		return fuelRequired;
	}

	public static void main(String[] args) throws Exception{
		int[] input = new int[1000];
		String file = "input.txt";
    	Scanner scanner = new Scanner(new File(file));
    	int n = 0;
    	while(scanner.hasNext()){
    		input[n] = Integer.parseInt(scanner.next());
    		n+=1;
    	}
    	scanner.close();

    	System.out.println(rocketEquation(input));

	}
}
