//Write a java program for  Unboxing.(all types).

package ANP_D0453;

public class Unboxing{
	public static void main(String[] args) {
		// Unboxing for all primitive data types

		// Byte to byte
		Byte byteObj = 10;
		byte b = byteObj;  // Unboxing
		System.out.println("byte value: " + b);

		// Short to short
		Short shortObj = 20;
		short s = shortObj; // Unboxing
		System.out.println("short value: " + s);

		// Integer to int
		Integer intObj = 30;
		int i = intObj; // Unboxing
		System.out.println("int value: " + i);

		// Long to long
		Long longObj = 40000L;
		long l = longObj; // Unboxing
		System.out.println("long value: " + l);

		// Float to float
		Float floatObj = 50.5f;
		float f = floatObj; // Unboxing
		System.out.println("float value: " + f);

		// Double to double
		Double doubleObj = 60.60;
		double d = doubleObj; // Unboxing
		System.out.println("double value: " + d);

		// Character to char
		Character charObj = 'A';
		char c = charObj; // Unboxing
		System.out.println("char value: " + c);

		// Boolean to boolean
		Boolean boolObj = true;
		boolean bool = boolObj; // Unboxing
		System.out.println("boolean value: " + bool);
	}
}

/* Output:
byte value: 10
short value: 20
int value: 30
long value: 40000
float value: 50.5
double value: 60.6
char value: A
boolean value: true
*/
