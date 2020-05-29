object isPrime extends App{

def gcd (a: Int, b: Int): Int = b match{
case x if x==0 => a
case x if x>a => gcd(x,a)
case x => gcd(x,a%x)
}

def isPrime (p: Int, n: Int = 2): Boolean = n match{
case x if (x==p) => true
case x if gcd(p,x)>1 => false
case x => isPrime(p,x+1)
}

print("Enter a number: ")
val n = scala.io.StdIn.readInt()
println("Is number "+n+" a prime number?");

if (isPrime(n)) println("Yes, "+n+" is a prime number") else println("No, "+n+" is not a prime number")

}