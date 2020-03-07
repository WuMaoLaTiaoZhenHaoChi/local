/**  
 * Copyright (c) 2015, xingzm@tydic.com All Rights Reserved.
 */
package com.dtt.demo.asn;

/**
 * AsnLen <br/>
 * 
 * @author Bradish7Y
 * @since JDK 1.7
 * 
 */
public class AsnLen {
	/**
	 * 长度所占用字节
	 */
	public int cntLength = 0;
	/**
	 * 内容长度
	 */
	public int length = 0;

	public void clear() {
		cntLength = 0;
		length = 0;
	}
}
