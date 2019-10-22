package com;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;  
    
 
public class Test {

	public static void main(String[] args) {
		    int a1,a2,a3;
	        int b,b1,b2;
	        int m,n,y,z;
	        int result = 0;
	        int i=0;
	        
	        Scanner sc=new Scanner(System.in);
	        
	        String f[]=new String[2];
	        f[0]="+";
	        f[1]="-";
	        
	        String s[]=new String[4];
	        s[0]="+";
	        s[1]="-";
	        s[2]="*";
	        s[3]="/";
	        
	        //控制操作
	        System.out.println("请选择100以内或1000以内");
	        m=sc.nextInt()+1;//输入你想要的范围
	        
	        System.out.println("请输入要产生的题数");
	        n=sc.nextInt();//输入你想要的题数
	        
	        System.out.println("请输入是否含有乘除1或0");
	        y=sc.nextInt();
	        
	        System.out.println("请输入是否含有负数");
	        z=sc.nextInt();
	        
	      
