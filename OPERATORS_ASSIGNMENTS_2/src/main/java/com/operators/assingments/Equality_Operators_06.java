package com.operators.assingments;


/**1)We can apply equality operators for every primitive type including boolean type 
also.**We can apply equality operators for object types also .
2)For object references r1 and r2 , r1 == r2 returns true if and only if both r1 and 
r2 pointing to the same object. i.e., == operator meant for reference-comparision 
Or address-comparision.
3) To use the equality operators between object type compulsory these should be 
some relation between argument types(child to parent , parent to child) , 
Otherwise we will get Compiletime error incompatible types
4)For any object reference of on r==null is always false , but null==null is always 
true . 
5)In general we can use .equals( ) for content comparision where as == operator 
for reference comparision 
 * @author SALEEM
 *
 */
public class Equality_Operators_06 {

	public static void main(String[] args) {
		
		System.out.println(10==20);
		System.out.println('a'=='b');
		System.out.println('a'==97);
		System.out.println(false==false);
		
		System.out.println("-------------------------------------------------------");
		
		Thread t1=new Thread();
		Thread t2 = new Thread();
		Thread t3=t1;
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		System.out.println("-------------------------------------------------------");
		
		Thread t= new Thread();
		Object o= new Object();
		String s= new String();
		
		System.out.println(t==o);
		System.out.println(s==o);
		//System.out.println(t==s);
		System.out.println("-------------------------------------------------------");

		String S= new String("Saleem");
		System.out.println(S==null);
		String s1=null;
		System.out.println(s1==null);
		System.out.println(null==null);
		System.out.println("-------------------------------------------------------");
		
		String s2=new String("Saleem");
		String s3=new String("Saleem");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));


	}

}
