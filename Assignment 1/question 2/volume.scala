object volume extends App{

var pi : Double = 22.00/7.00;

def calVol(rad: Double) = (4.00/3.00)*(pi)*(scala.math.pow(rad,3));

println("# Volume of the sphere with radius 5 :- " + calVol(5));

}