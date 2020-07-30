object bank extends App{
//4. Bank defines a list of accounts
var bank:List[Account]=List(new Account("976251580v",10816,150000),
			    new Account("961548794v",34865,100000),
			    new Account("975951049v",14841,250000),			
			    new Account("976540808v",64655,125000),
			    new Account("972810177v",94872,-15000),
			    new Account("980510760v",31548,180000),
			    new Account("981812336v",84595,275000),
			    new Account("982200385v",97187,-89000),
			    new Account("982511259v",14875,-45000),
			    new Account("987011122v",67845,-75000),
			    new Account("995110326v",25994,114000),
			    new Account("971561068v",52488,-14500),
			    new Account("961832357v",77799,480000),
			    new Account("963041667v",15487,95000),
			    new Account("970530908v",15489,-4500),
			    new Account("962981135v",44589,-25000),
			    new Account("942533861v",97854,-100000),
			    new Account("972561355v",39541,116000),
			    new Account("976693442v",97451,-35000),
			    new Account("980222330v",75486,-85000))

val a1=new Account("976251580v",10816,150000)

//4.1 List of accounts with negative balances
val overdraft=(b:List[Account])=>b.filter(_.balance<0)

println("Accounts with negative balances")
val it=overdraft(bank).iterator
while(it.hasNext){
println(it.next)
}

//4.2 Total of all account balances
val totbalance=(b:List[Account])=>b.map(_.balance).reduce((x,y)=>x+y)

println("\nSum of all account balances :"+totbalance(bank))

//4.3 deposite/withdraw interest
val interest=(b:List[Account])=>b.map(_.addinterest)

bank=interest(bank)

println("\nAccounts after adding interest")
val it1=bank.iterator
while(it1.hasNext){
println(it1.next)
}
}

class Account(id:String,n:Int,b:Double){

val nic:String=id
val acnumber:Int=n
var balance:Double=b

//If balance is positive deposit interest is .05
//If balance is negative overdraft interest is .1

def addinterest()=if(this.balance<0) new Account(this.nic,this.acnumber,this.balance*1.1)
		  else               new Account(this.nic,this.acnumber,this.balance*1.05)

override def toString=f"[$nic%s:$acnumber%d:$balance%.2f]"

}