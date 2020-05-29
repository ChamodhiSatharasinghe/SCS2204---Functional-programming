object IsEvenOdd extends App{

def isEven(n: Int):Boolean=n match{
case 0 => true
case _ => isOdd (n-1)
}

def isOdd(n: Int):Boolean = (!(isEven(n)))

print("Enter a number: ")
val n = scala.io.StdIn.readInt()

print("# Number "+n+" is ")
if(isEven(n)) print("a EVEN number.") else print("an ODD number.")

}