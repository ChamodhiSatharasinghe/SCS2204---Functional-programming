object evenAddition extends App{

def isEven(n: Int):Boolean=n match{
case 0 => true
case _ => isOdd (n-1)
}

def isOdd(n: Int):Boolean = (!(isEven(n)))

def evenAdd(n: Int): Int=n match{
case n if(n==0) =>0
case n if(isEven(n)) =>n+evenAdd(n-1)
case n if(isOdd(n)) =>evenAdd(n-1)
}

print("Enter a number: ")
val n = scala.io.StdIn.readInt()

println("# Addition of even numbers less than "+n+" : "+evenAdd(n));

}