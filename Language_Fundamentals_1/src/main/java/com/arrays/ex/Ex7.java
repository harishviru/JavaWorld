package com.arrays.ex;

//Anonymous Arrays: 
//Sometimes we can create an array without name such type of nameless arrays are called anonymous arrays.
class Ex7
{
        public static void main(String [] args){
	     System.out.println("before calling sum");
	
     
      System.out.println(sum(new int[]{10,20,30,40}));
	     System.out.println("after calling sum");
   
	}//main

       public static int sum (int [] x){
      	     System.out.println("inside. .... sum  method");
         int total=0;
         for(int x1:x)
         {

              total=total+x1;
          }//for
          return total;
    }//sum

}//class