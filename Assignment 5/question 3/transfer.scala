object transfer extends App{
val a1=new Account("976251580v",10816,150000)
val a2=new Account("961548794v",34865,100000)

println("Account 1: "+a1)
println("Account 2: "+a2)
print("Enter amount to trasfer Acount 1 to Acoount 2: ")
val n = scala.io.StdIn.readDouble()

a1.transfer(a2,n)

println("Transaction successful")
println("Account 1: "+a1)
println("Account 2: "+a2)

}

class Account(id:String,n:Int,b:Double){

val nic:String=id
val acnumber:Int=n
var balance:Double=b

def withdarw(a:Double)=this.balance=this.balance-a

def deposite(a:Double)=this.balance=this.balance+a

def transfer(a:Account,b:Double)={
require(b>0,"trasfered ammount can't be less than 0"); 
this.withdarw(b);
a.deposite(b);
}

override def toString=s"[$nic:$acnumber:$balance]"

}