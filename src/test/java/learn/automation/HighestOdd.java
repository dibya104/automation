package learn.automation;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class HighestOdd {

	public static void main(String[] args) {
		System.out.println("Enter max size of array");
		Scanner scSize=new Scanner(System.in);
		int size=scSize.nextInt();
		int array[]=new int[size];
		int count=0;
		while(true){
			System.out.println("Enter Integer Number:");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			if(num>=0){
				array[count]=num;
				count++;
			}
			if(num<0){
				break;
			}
		}
		int hstodd=HighestOdd.processArray(array);
		if(hstodd==-1){
			System.out.println("There is No odd numbers in array");
		}
		else{
			System.out.println("Highest Odd Number:"+hstodd);
		}
	}
	public static int processArray(int array[]){
		int odd=0;
		for(int i=0;i<=array.length-1;i++){
			if(array[i]%2!=0)
			{
				if(odd==0)
				{
					odd=array[i];
				}

				if(odd<array[i])
				{
					odd=array[i];
				}
			}          
		}
		if(odd!=0){
			return odd;
		}
		return -1;
	}

}
