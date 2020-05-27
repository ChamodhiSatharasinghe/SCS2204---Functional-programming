object salary extends App{

def normal(h1: Int) = 150 * h1;
def ot(h2: Int) = 75 * h2;
def salary(h1: Int, h2: Int)= normal(h1) + ot(h2);
def tax(h1: Int, h2: Int)= salary(h1,h2) * 0.1;
def takeHomesalary(h1: Int, h2: Int)= salary(h1,h2) - tax(h1,h2);

println("# Take home salary of a normal employee(For week) : " + takeHomesalary(40,20));
println("# Take home salary of a normal employee(For month) : " + 4*takeHomesalary(40,20));

}