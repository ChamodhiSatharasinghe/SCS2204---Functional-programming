object PrimeSeq extends App{

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

def PrimeSeq(c: Int):Any={
if (c>2) PrimeSeq(c-1);
if (isPrime(c)) println(c);
}

print("Enter a number: ")
val n = scala.io.StdIn.readInt()

println("##Prime Sequence##");
PrimeSeq(n);

}