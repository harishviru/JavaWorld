package com.saleem.Enum;

public enum Beer_1 {

	KF, KO, RC, FO;

	public static void main(String args[]) {
		Beer b1 = Beer.RC;
		switch (b1) {
		case KF:
			System.out.println("it is childrens brand");
			break;
		case KO:
			System.out.println("it is too lite");
			break;
		case RC:
			System.out.println("it is too hot");
			break;
		case FO:
			System.out.println("buy one get one");
			break;
		default:
			System.out.println("other brands are not good");
		}

	}
}
