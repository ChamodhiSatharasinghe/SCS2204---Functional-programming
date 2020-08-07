object caseclass extends App{
val p1=Point(2,3);
val p2=Point(5,8);

println("1st Point:"+p1)
println("2nd Point:"+p2)

//question 1
println("\nAddition of two points:"+(p1+p2));

//question 2
println("\nx move by 2 and y move by 1:"+p1.move(2,1))

//question 3
println("\nDistance between p1 and p2:"+p1.distance(p2))

//question 4
println("\nInvert first point:"+p1.invert)
}

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

//question 1
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)

//question 2
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

//question 3
  def distance(that:Point)=scala.math.sqrt(scala.math.pow(this.x-that.x,2)+scala.math.pow(this.y-that.y,2))

//question 4
  def invert()=Point(this.y,this.x);
}