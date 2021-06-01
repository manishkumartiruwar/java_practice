
// Java program to convert   any number  to decimal.
 
import java.io.*;

public class AnyBaseToDecimal
{
// To return value of a char.For example, 2 is returned  for 'A', 11 for 'B'

static int val(char d)
{
	if (d >= '0' && d <= '9')
		return (int)d - '0';
	else
		return (int)d - 'A' + 10;
}

// Function to convert a number from given base   'b' to decimal

static int toDeci(String str,
				int base)
{
	int len = str.length();
	int power = 1; // Initialize power of base
			
	int num = 0; // Initialize result
	int i;

	// Decimal equivalent is str[len-1]*1 + str[len-2] *base + str[len-3]*(base^2) + ...

	for (i = len - 1; i >= 0; i--)
	{
		// A digit in input number  must be less than numbers base.

		if (val(str.charAt(i)) >= base)
		{
		System.out.println("Invalid Number");
		return -1;
		}

		num += val(str.charAt(i)) * power;
		power = power * base;
	}

	return num;
}

public static void main (String[] args)
{
	String str = "AAA";                /// change for input
	int base = 11;                  /// change for base
	System.out.println("Decimal equivalent of "+
						str + " in base "+ base +
									" is "+ " "+
							toDeci(str, base));
}
}
