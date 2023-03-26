package com.arrays.ex;

//Var- arg methods (variable no of argument methods) (1.5)


class Ex20 
{
               public static void methodOne(int... x)
				   {
					System.out.println("var-arg method");
				   }

		public static void main(String[] args) 
{
			      methodOne();
				 methodOne();
                 methodOne(10,20,30);
	}//main

}//class
