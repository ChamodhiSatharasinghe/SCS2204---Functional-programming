object Fibonacci extends App{

def fibonacci(n: Int): Int = n match{
case 0 => 0
case 1 => 1
case _ => fibonacci(n-1)+fibonacci(n-2)
}

def printFib(n: Int):Any={
if(n>0) printFib(n-1)
println(fibonacci(n))
}

print("Enter a number :")
var n=scala.io.StdIn.readInt()

println("##First "+n+" FIBONACCI numbers##")
printFib(n)

}