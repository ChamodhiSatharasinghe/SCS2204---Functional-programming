object wholesalecost extends App{

var covprice : Double = 24.95;

def cost(books: Double) = (covprice * books * (60.0/100.0)) + (3*50) +(0.75*(books-50));

println("# Total wholesale cost for 60 copies :- Rs. " + cost(60));

}