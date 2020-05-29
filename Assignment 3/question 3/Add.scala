object Add extends App{

def Addition(n: Int): Int = if (n==1) n else n+Addition(n-1)

print("Enter a number: ")
var n=scala.io.StdIn.readInt()

println ("# Addition of numbers from 1 to "+n+": "+ Addition(n))

}