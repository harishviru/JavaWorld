package com.fundamentals;

//#01
public final class Immutable {

	//#02(i)
	private final int i;

	//#02(ii)
	 Immutable(int i) {
		this.i = i;
	}
	
	//#03
	public  Immutable getInstance(int i) {
		if (this.i == i) {
			return this;
		}else {
			return (new Immutable(i));
		}
	}
	
    public static void main(String[] args) {
		
    	Immutable i1=new Immutable(10);
    	
    	
		System.out.println(i1);
		System.out.println(i1.hashCode());
        System.out.println();
		
		Immutable i2=i1.getInstance(10);
		
		System.out.println(i2);
		System.out.println(i2.hashCode());
        System.out.println();

		
        Immutable i3=i1.getInstance(100);
		
		System.out.println(i3);
		System.out.println(i3.hashCode());
		
		
	}
    
    @Override
    public String toString() {
    	return this.i +"";
    }

}
