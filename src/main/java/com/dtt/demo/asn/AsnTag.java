package com.dtt.demo.asn;

public class AsnTag {
	/**
	 * 标记值
	 */
	public int tag;

	/**
	 * 长度
	 */
	public int length;

	public void clear() {
		tag = 0;
		length = 0;
	}
}
