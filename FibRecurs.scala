object Fibonacci
{


def fibDigits( n : Int) : String = 
	{ 
		var digits = ""
		  def fib( n: Int, a:Int, b:Int): Int = n match {
		    case 0 => a 
		    case _ => 
			var x = fib( n-1, b, a+b )
			digits = digits + x.toString();
		  }

		fib(n, 0, 1)
	  	return (digits )
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
