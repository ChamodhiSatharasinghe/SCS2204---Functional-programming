object ticketPrice extends App{

def attendees(price: Int)= 120 + ((15 - price)/5) * 20;
def income(price: Int)= attendees(price) * price;
def cost(price: Int)= 500 + attendees(price) * 3;
def profit(price: Int)= income(price) - cost(price);

var i: Int = 0;
var max: Int = 0;

for(i <- 0 to 35 by 5){
if(profit(max) < profit(i)) max = i;
}

println("# Highest profit : "+ profit(max));
println("# Best ticket price : " + max);

}