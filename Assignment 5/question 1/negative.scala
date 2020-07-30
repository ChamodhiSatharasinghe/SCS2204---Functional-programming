object negative extends App{

print("Enter numerator: ")
val n = scala.io.StdIn.readInt()
print("Enter denominator: ")
val d = scala.io.StdIn.readInt()

val x=new Rational(n,d)

println("Rational number : "+x)
println("Negative of the rational number : "+x.neg)

}

class Rational(n:Int,d:Int){

require(d>0,"denominator must be greater than 0")

val numer=n
val denom=d

def neg=new Rational(-this.numer,this.denom)

override def toString=s"$numer/$denom"
}