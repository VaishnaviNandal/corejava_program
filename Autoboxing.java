//Write  a java program for Autoboxing(All Primitive Types)

package ANP_D0453;

public class Autoboxing{
	public static void main(String[] args) {
		// Autoboxing for all primitive data types

		// byte to Byte
		byte b = 10;
		Byte byteObj = b;
		System.out.println("Byte Object: " + byteObj);

		// short to Short
		short s = 20;
		Short shortObj = s;
		System.out.println("Short Object: " + shortObj);

		// int to Integer
		int i = 30;
		Integer intObj = i;
		System.out.println("Integer Object: " + intObj);

		// long to Long
		long l = 40000L;
		Long longObj = l;
		System.out.println("Long Object: " + longObj);

		// float to Float
		float f = 50.5f;
		Float floatObj = f;
		System.out.println("Float Object: " + floatObj);

		// double to Double
		double d = 60.60;
		Double doubleObj = d;
		System.out.println("Double Object: " + doubleObj);

		// char to Character
		char c = 'A';
		Character charObj = c;
		System.out.println("Character Object: " + charObj);

		// boolean to Boolean
		boolean bool = true;
		Boolean boolObj = bool;
		System.out.println("Boolean Object: " + boolObj);
	}
}

/*Output:
Byte Object: 10
Short Object: 20
Integer Object: 30
Long Object: 40000
Float Object: 50.5
Double Object: 60.6
Character Object: A
Boolean Object: true
*/
