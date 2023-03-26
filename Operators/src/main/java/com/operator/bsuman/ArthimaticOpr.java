package com.operator.bsuman;

public class ArthimaticOpr {
	public static void main(String[] args) {
		int x=10;
		int y=15;
		//System.out.println(++x);
		//System.out.println(++y);
		if (++x > 10  || ++y > 15) {
			x++;
		}else {
			y++;
		}
		System.out.println(x+"  "+y);
	}

}
