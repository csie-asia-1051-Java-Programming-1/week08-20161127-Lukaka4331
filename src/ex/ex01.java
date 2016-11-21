package ex;
import java.util.Scanner;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021044 鐘岑哲
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn =new Scanner(System.in);
		   int a=scn.nextInt();
		   System.out.println(verb(a));}
	public static String verb (int a){
		 String b="";
	     while(a>0){
		b=Integer.toString(a%2)+b;
	    a/=2;	 
	    	 
	    	 
	    	 
	    	 
	}return b;
		
	}

}
