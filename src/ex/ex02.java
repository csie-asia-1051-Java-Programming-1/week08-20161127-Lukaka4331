package ex;import java.util.Scanner;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021044 鐘岑哲
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scn =new Scanner(System.in);
		  System.out.println("輸入數字=");
		   int a=scn.nextInt();
		   System.out.println("結果="+verb(a));}
	
	public static String verb (int a){  Scanner scn =new Scanner(System.in);
    	String b=""; 		  System.out.println("轉換的進制=");
    	int c=scn.nextInt();while(a>0){
    		b=Integer.toString(a%c)+b;
    	    a/=c;	 
    	    	 
    	    	 
    	    	 
    	    	 
    	}return b;
}
}