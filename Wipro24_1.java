/*
You are given a single character c. The character c lies between la - 2] or [A - Z].
If the character is in the upper case then you are required to change that to lower case 
or in the lower case then you are required to change it to upper case and print the same.

*/

import java.util.Scanner;
class Wipro24_1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println(swapeCase(ch));
	}
	public static String swapeCase(char ch) //we swape the characters case type
        {
		String str = String.valueOf(ch);
                //upper to lower
		if(ch>='A'&&ch<='Z'){
			return str.toLowerCase();
		}
                //lower to upper
		else 
		{
			return str.toUpperCase();
		}
	}
}
