package com.xinxin.evryday;

import javax.xml.parsers.DocumentBuilder;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;
import org.springframework.data.repository.support.PageableExecutionUtils.TotalSupplier;

public class xin2017921 {
	public static void main(String[] args) {
		double[]myList = {1.9,2.9,3.4,3.5};
		//打印所有数组元素
		for (int i = 0 ; i<myList.length; i++) {
			//int i=0
			//判断i<myList.length 符不符合  符合 就执行循环里面的
			//i++
			//判断i<myList.length 符不符合  符合 就执行循环里面的   不合符 跳出
			System.out.println(myList[i]+"");
			}
		double total = 0 ;
		for (int i = 0 ;i<myList.length;i++) {
			total += myList[i];
	     }
	System.out.println("total is :"+total);
	    double max = myList [0];
	    for (int i = 0 ; i <myList.length;i++ ) {
	    	if (myList[i]>max ) max=myList[i];
	    	
         }
	    System.out.println("max is : "+max);
	    
	   
    }
	 public static void printArray(int[] array) {
	 
   	  for (int i = 0; i < array.length; i++) {
   	    System.out.print(array[i] + " ");
   	  	
   	  }
   	
   	}
}
