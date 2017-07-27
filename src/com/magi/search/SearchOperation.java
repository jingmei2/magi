/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */ 
package com.magi.search;

import com.magi.sort.SortOperation;

/**
 * @ClassName: SearchOperation 
 * @Description: TODO(查找方法) 
 * @author magi
 * @date 2017年6月7日 下午10:50:12 
 *  
 */
public class SearchOperation {
	public static SortOperation sortOperation = new SortOperation();
	/** 
	 * @Title: binarySearch 
	 * @Description: TODO(二分查找) 
	 * @param @param a
	 * @param @param goal
	 * @param @return    设定文件 
	 * @return int    返回类型 
	 * @throws 
	 */
	public static int binarySearch (int[] a , int goal) {
		int low = 0;
		int high = a.length-1;
		while (low<=high) {
			int middle = (high + low)/2;
			if (a[middle]==goal) {
				return middle;
			}else if (a[middle] > goal ) {
				high = middle-1;
			} else {
				low = middle +1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 5, 7, 8, 9,42,65,76,26,83,28,25,82,45,45};  
        int[] insertSort_arr = sortOperation.insertSort(arr);
        System.out.println(binarySearch(insertSort_arr, 6));   
	}
}
