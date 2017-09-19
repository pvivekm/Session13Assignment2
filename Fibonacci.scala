object Fibonacci
{


	def fibDigits( n : Int ) : String = 
	{
	  var a = 0
	  var b = 1
	  var i = 0	  
 	  var digits = ""
	  while( i < n ) {
	    val c = a + b
	    a = b
	    b = c
	    i = i + 1
	    digits = digits + c
	  } 
	  return digits
	}

	def main(args: Array[String])
	{
		println("Enter the number of Fibonacci numbers to generate  : ");
		var x = Console.readInt();
		var y = fibDigits(x);
		var n = 0;
		println("The digits of  " +  x + " fibonacci numbers are : " + y);
		println("Enter the position of the digit required: ");
		do
		{
			println("Enter position less than " + y.length())
			n = Console.readInt()
		}
		while(n >= y.length())
		println("The " + n + "th digit is : " + y.charAt(n-1) )

	}
}
