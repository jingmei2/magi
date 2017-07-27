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

public class LogTime {	
	private static long nowTime = 0;
	private static long endTime = 0;
	private static long useTime = 0;
	private static long step = 0;
	public void starTime(){
		nowTime = System.currentTimeMillis();
		System.out.println("开始时间nowTime为:"+nowTime);
	}
	public void endTime(){
		endTime = System.currentTimeMillis();
		System.out.println("结束时间endTime为:"+endTime);
	}
	public void useTime(){
		useTime = endTime-nowTime;
		System.out.println("使用时间endTime为:"+useTime +",是用的步数为:"+step);
	}
	public long getStep(){
		step ++;
		return step;
	}
}
