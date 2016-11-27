package ex;
import java.util.Scanner;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021044 鐘岑哲
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		calculator cpu =new calculator();
		System.out.println("輸入 1~7 來選擇使用的功能");
		System.out.println("1:加法  2:減法 3:乘法 4:除法 5:平方 6:立方 7:開根號");			
		int a=scn.nextInt();
		switch(a){
		case 1 :cpu.plus();
		case 2 :cpu.minus();
		case 3 :cpu.multi();			
		case 4 :cpu.divi();			
		case 5 :cpu.pow();			
		case 6 :cpu.nano3();//立方
		case 7 :cpu.squrt();//開根號					
		            } 		
	          }
       }	
		
		class calculator{
			Scanner scn=new Scanner(System.in);
			
			public  void plus() {
			
			double n1=scn.nextDouble();
			double n2=scn.nextDouble();		
			System.out.print("("+n1+")"+"+"+"("+n2+")"+" = "+(n1+n2));
			
			}
	 						
			public  void minus(){
				float n1=scn.nextFloat();
				float n2=scn.nextFloat();
				System.out.print("("+n1+")"+"-"+"("+n2+")"+" = "+(n1-n2));

			}
			
			public  void multi(){				
					float n1=scn.nextFloat();
					float n2=scn.nextFloat();
					System.out.print("("+n1+")"+"*"+"("+n2+")"+" = "+(n1*n2));
																
			}
	
			public  void divi(){
				float n1=scn.nextFloat();
				float n2=scn.nextFloat();
				System.out.print("("+n1+")"+"/"+"("+n2+")"+"="+(n1/n2));																
				
			}
			public  void pow(){
				float n1=scn.nextFloat();		
				System.out.print("("+n1+")"+"^"+"2"+"="+(Math.pow(n1, 2)));
			}
			
			public  void nano3(){
				float n1=scn.nextFloat();		
				System.out.print("("+n1+")"+"^"+"3"+"="+(Math.pow(n1, 3)));
			}
			
			public  void squrt(){
				float n1=scn.nextFloat();	
				System.out.print("("+n1+")"+"^"+"1/2"+""+"="+(Math.sqrt(n1)));
			}
		}

			

