/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */ 
package com.magi.sort;

import java.util.Arrays;

public class SortOperation {
	public static SortOperation sortOperation = new SortOperation();
	public static LogTime logTime = new LogTime();
	/**
	 * @return  
	 * (1)假定原数组(n-1)(n>=2)为有序的数组,
	 * (2)把第 n 个数插入到 n-1和 n+1之间,使得 arr[n-1] <= arr[n] <= arr[n+1];
	 * (3)直到循环结束
	 * @Title: insertSort 
	 * @Description: TODO(插入排序) 
	 * @param @param arr    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public int[] insertSort(int[] arr){
		logTime.starTime();
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
			int j = i - 1;//插入的线右移;
			temp = arr[i];// 获取第 i 个数
			for(; j>=0 && temp <arr[j]; j--){//第 j 个数为第 i 个数的前一个,并且第 j 个数之前都为正确顺序排序
			   arr[j+1]=arr[j];              //将大于temp的值整体后移一个单位  
			   logTime.getStep();
			} 
			arr[j+1]=temp;//把第 i 个数赋值给
		}
		System.out.println(Arrays.toString(arr));
		logTime.endTime();
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int[] insertSort_arr = sortOperation.insertSort(arr);
		System.out.println("insertSort_arr="+Arrays.toString(insertSort_arr));
		logTime.useTime();
	}
}
