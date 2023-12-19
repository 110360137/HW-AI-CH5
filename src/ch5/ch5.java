package ch5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ch5
{
	public static void main(String[] args)
	{
		Company cmp = new Company();
				
		Driver drv1 = new Driver(cmp);
		drv1.start();
		
		Driver drv2 = new Driver(cmp);
		drv2.start();
	}
}

class Company
{
	private int sum = 0;
	public synchronized void add(int a)
	{
		int tmp = sum;
		System.out.println("目前的合計金額是" + tmp + "元");
		System.out.println("賺到" + a + "元了。");
		tmp = tmp + a;
		System.out.println("合計金額是" + tmp + "元");
		sum = tmp;
	}
}
	
class Driver extends Thread
	{
		private Company comp;
		public Driver(Company c) {
			comp = c;
		}
	
		public void run(){
			for(int i=0 ; i<3 ; i++){
				comp.add(50);
		}
	}
}


/*

FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			
			pw.close();
			
			System.out.println("資料已經寫入檔案了");

System.out.println("請輸入字串");
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			String str = br.readLine();
			
			System.out.println("已輸入字串" + str);
		}
		
if (args.length !=1)
		{
			System.out.println("請指定正確的檔案名稱");
			System.exit(1);
		}
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
			String str;
			while((str = br.readLine())!=null)
			{
				System.out.println(str);
			}
			
			br.close();
		}
		
		catch(IOException e)
		{
			System.out.println("輸入輸出錯誤");
		}		
		
public class ch5 
{
	public static void main(String[] args)throws CarsException
	{
		Car car1;
		car1 = new Car();
		
		catch(CarException e) {
			System.out.println("拋出" + e + "了");
			
			car1.show();
			
		}
		
	
	}
}

class CarException extends Exception
{
	
}

class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("已生產了汽車");
	}
	
	public void setCar(int n, double g) throws CarException
	{
		if(g < 0)
		{
			CarException e = new CarException();
		throw e;
		} else
		{
			num = n;
			gas = g;
			System.out.println("將車號設為" + num + "，汽油量設為" + gas);
		}	
	}
	
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}


Car car1 = new Car();
car1.show();


try
		{
			car1.setCar(1234, -10.0);
		}

try
		{
			int[] test;
			test = new int[5];
		
			System.out.println("將值指定給test[10]");
		
			test[10] = 80;
			System.out.println("將80指定給test[10]");
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("超過陣列的範圍了");
			System.out.println("發生了" + "這個例外");
		}
		
		finally
		{
			System.out.println("最後一定會執行這個處理");
		}
		
		System.out.println("順利地執行完畢了");
*/